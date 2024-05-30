package st10439055;

/**
 *
 * @author nicholas
 */
import javax.swing.JOptionPane;
import java.util.regex.Pattern; //for finding the capital letters and special characters in the password
import javax.swing.*;

import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ST10439055_Main {
    
String ReturnMessage = "asb werk jou poes";

    public static st10439055 MyUser = new st10439055();

    public static void main(String[] args) {
        
        

        st10439055 Users = new st10439055();
        st10439055 LogIn = new st10439055();
        st10439055 Tasks = new st10439055();

        Users = getUser();
        JOptionPane.showMessageDialog(null, Users.sGoToLogIn);

        LogIn = getLogIn();

        //Part 2 Start!!!!
        JOptionPane.showMessageDialog(null, MyUser.sWelcomeToKanban);

        String menu = "\nPlease choose one of the following options:\n"
                + "1) Add tasks\n"
                + "2) Show report\n"
                + "3) Quit\n";

        while (true) {
            String choice = JOptionPane.showInputDialog(null, menu);
            switch (choice) {

                case "1":
                    Tasks = getTasks();
                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, "Coming Soon");
                    // This feature is in development
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "You chose to Quit.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a valid option.");

            }//end case

        } //end while
    }

    public static st10439055 getUser() {

        String sUsernameNew;
        String sPasswordNew;
        boolean bCheckUsername;
        boolean bCheckPasswordComplexity;
        String sNewName;
        String sNewSurname;
        boolean bBlank;

        JTextField firstName = new JTextField();
        JTextField lastName = new JTextField();

        Object[] message = {
            "First name:", firstName,
            "Surname: ", lastName
        };
        do {
            bBlank = true;

            JOptionPane.showConfirmDialog(null, message);

            sNewName = firstName.getText();
            sNewSurname = lastName.getText();

            MyUser.setName(sNewName);
            MyUser.setSurename(sNewSurname);

            if (sNewName.equals("") || sNewSurname.equals("")) {
                bBlank = false;
                JOptionPane.showMessageDialog(null, "Please enter all fields.", "Try again.", JOptionPane.ERROR_MESSAGE);
            }

        } while (!bBlank);

        do {
            bCheckUsername = true;
            sUsernameNew = JOptionPane.showInputDialog("Enter your username. \n - Should not be longer than 5 characters. \n - Must contain an underscore.");

            if (sUsernameNew.length() > 5) {  //longer then 5 characters
                JOptionPane.showMessageDialog(null, MyUser.sInvalidUsernameLength);
                bCheckUsername = false;
            } else if (!sUsernameNew.contains("_")) { //does not contain an underscore
                JOptionPane.showMessageDialog(null, MyUser.sInvalidUsernameUnder);
                bCheckUsername = false;
            } else {
                JOptionPane.showMessageDialog(null, MyUser.sValidUsername); //correct username
            }
        } while (!bCheckUsername); // loop ends when boolean stays true

        MyUser.setUsername(sUsernameNew);

        do {
            bCheckPasswordComplexity = true;
            sPasswordNew = JOptionPane.showInputDialog("Enter a password. \n - Must be at least 8 characters long. \n - Contain a capital letter. \n - A number. \n - A special character.");

            if (sPasswordNew.length() < 8) { //shorter than 8 characters
                JOptionPane.showMessageDialog(null, MyUser.sInvalidPasswordLenth);
                bCheckPasswordComplexity = false;
            } else if (!Pattern.compile("[A-Z]").matcher(sPasswordNew).find()) { //does not contain a capital letter
                JOptionPane.showMessageDialog(null, MyUser.sInvalidPasswordCaps);
                bCheckPasswordComplexity = false;
            } else if (!Pattern.compile("[0-9]").matcher(sPasswordNew).find()) { //does not contain a number
                JOptionPane.showMessageDialog(null, MyUser.sInvalidPasswordNum);
                bCheckPasswordComplexity = false;
            } else if (!Pattern.compile("[^a-zA-Z0-9]").matcher(sPasswordNew).find()) { //does not contain a special character
                JOptionPane.showMessageDialog(null, MyUser.sInvalidPasswordSC);
                bCheckPasswordComplexity = false;
            } else {
                JOptionPane.showMessageDialog(null, MyUser.sValidPassword); //password is correct
            }
        } while (!bCheckPasswordComplexity);// loop ends when boolean stays true

        MyUser.setPassword(sPasswordNew);

        return MyUser;

    }

    public static st10439055 getLogIn() {

        String sLogInUsername;
        String sLogInPassword;
        boolean bLogIn;
        String sOldUsername;
        String sOldPassword;
        String sName;
        String sSurname;

        sOldUsername = MyUser.getUsername();
        sOldPassword = MyUser.getPassword();

        sName = MyUser.getName();
        sSurname = MyUser.getSurename();

        do {
            bLogIn = true;
            sLogInUsername = JOptionPane.showInputDialog("Enter your username.");
            sLogInPassword = JOptionPane.showInputDialog("Enter your password.");
            if (!sLogInUsername.equals(sOldUsername)) { //sees if username is the same as the one as the one typed at first.
                JOptionPane.showMessageDialog(null, MyUser.sLogInUsernameInValid);
                bLogIn = false;
            } else if (!sLogInPassword.equals(sOldPassword)) {
                JOptionPane.showMessageDialog(null, MyUser.sLogInPasswordInValid);
                bLogIn = false;
            } else {

                JOptionPane.showMessageDialog(null, MyUser.sWelcomeUser + sName + " " + sSurname);
            }
        } while (!bLogIn);// loop ends when boolean stays true

        return MyUser;

    }

    public static st10439055 getTasks() {
        boolean bBlank;
        boolean CheckDisc;
        Integer iNumTasks, iTaskDuration;
        int I, iTask, iFullDuration;
        String sNumTasks;
        String snTaskName, snTaskDiscription, snDeveloper, snTaskDuration, snTaskID, sWholeTask, sStatus;
        sStatus = "";
        iFullDuration = 0;

        String[] taskNamesArr = new String[10];
        String[] developersArr = new String[10];
        String[] taskDurationsArr = new String[10];
        String[] statusesArr = new String[10];
        Integer[] iTaskNumArr = new Integer[10];
        String[] sTaskIDArr = new String[10];

        sNumTasks = JOptionPane.showInputDialog(null, "Enter the amount of tasks you would be adding");
        iNumTasks = Integer.parseInt(sNumTasks);

        for (I = 1; I <= iNumTasks; I++) {
            iTask = I - 1;

            JTextField sTaskName = new JTextField();
            JTextField sTaskDiscription = new JTextField();
            JTextField sDeveloper = new JTextField();
            JTextField sTaskDuration = new JTextField();
            
            
            String[] sStatuses = {"To do", "Done", "Doing"};
            JComboBox<String> statusBox = new JComboBox<>(sStatuses);

            Object[] message = {
                "Task Number: " + iTask,
                "Task Name:", sTaskName,
                "Task Description:", sTaskDiscription,
                "Developer Details:", sDeveloper,
                "Task Duration(In hours): ", sTaskDuration,
                "Task Status:", statusBox,};

            int iresult;
            do {
                iresult = JOptionPane.showConfirmDialog(null, message, "Add Task:", JOptionPane.OK_CANCEL_OPTION);
                if (iresult == JOptionPane.CANCEL_OPTION) {
                    sStatus = (String) statusBox.getSelectedItem();
                    break;
                }
                bBlank = true;

                snTaskName = sTaskName.getText();
                snTaskDiscription = sTaskDiscription.getText();
                snDeveloper = sDeveloper.getText();
                snTaskDuration = sTaskDuration.getText();

                CheckDisc = checkTaskDiscription(snTaskDiscription);
                if (CheckDisc == false) {
                    JOptionPane.showMessageDialog(null, "Task description should not be over 50 characters long.", "Try again.", JOptionPane.ERROR_MESSAGE);
                    I--;
                    continue;
                }

                iTaskDuration = Integer.parseInt(snTaskDuration);
                iFullDuration = iTaskDuration + iFullDuration;
                snTaskID = createTaskID(snTaskName, snDeveloper, iTask);

                if (snTaskName.equals("") || snTaskDiscription.equals("") || snDeveloper.equals("") || snTaskDuration.equals("") || snTaskID.equals("")) {
                    bBlank = false;
                    JOptionPane.showMessageDialog(null, "Please enter all fields.", "Try again.", JOptionPane.ERROR_MESSAGE);
                } else {

                }

                sWholeTask = printTaskDetails(sStatus, snDeveloper, iTask, snTaskName, snTaskDiscription, snTaskID, iTaskDuration);
                JOptionPane.showMessageDialog(null, sWholeTask);

            } while (!bBlank);
        }// end count loop
        JOptionPane.showMessageDialog(null, "Total number of hours spent on tasks: " + iFullDuration + "hrs");

        return MyUser;
    }

    public static boolean checkTaskDiscription(String sTaskDiscription) {
        if (sTaskDiscription.length() < 50) {
            return true;
        } else {
            return false;
        }

    }

    public static String createTaskID(String sTaskName, String sDeveloper, int iTask) {
        return sTaskName.substring(0, 2).toUpperCase() + ":" + iTask + ":" + sDeveloper.substring(sDeveloper.length() - 3).toUpperCase(); //generate TaskID
    }

    public static String printTaskDetails(String sStatus, String sDeveloper, int iTask, String sTaskName, String sDiscription, String sTaskID, int iTaskDuration) {
        return "Task status: " + sStatus + "\n"
                + "Developer details: " + sDeveloper + "\n"
                + "Task number: " + iTask + "\n"
                + "Task name: " + sTaskName + "\n"
                + "Task discription: " + sDiscription + "\n"
                + "Task ID: " + sTaskID + "\n"
                + "Duration: " + iTaskDuration + "hrs";
    }

  
    public int returnTotalHours(Integer iTaskduration, Integer IFullduration) {
        return iTaskduration + IFullduration;
    }
    
  public String getMessage()
  {
      return ReturnMessage;
  }
    
}

//Microsoft copilot: Your everyday ai companion (no date) Microsoft Copilot: Your everyday AI companion. Available at: https://copilot.microsoft.com/ (Accessed: 12 April 2024). 
//Regular expressions (regex) in 100 seconds (2020) YouTube. Available at: https://www.youtube.com/watch?v=sXQxhojSdZM (Accessed: 12 April 2024).

