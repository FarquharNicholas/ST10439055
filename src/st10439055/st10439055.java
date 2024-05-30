
package st10439055;

/**
 *
 * @author nicho
 */
    public class st10439055 {
    String sUsername;
    String sPassword; 
    String sName;
    String sSurename;
    String sValidUsername = "Username was successfully captured.";
    String sValidPassword = "Password was successfully captured.";
    String sInvalidUsernameUnder = "Username is not correct. The username must contain an underscore.";
    String sInvalidUsernameLength = "Username is not correct. The username cant be more than 5 characters long.";
    String sInvalidPasswordLenth = "Password is not correct. The password must atleast be 8 characters long.";
    String sInvalidPasswordCaps = "Password is not correct. The password must contain a capital letter.";
    String sInvalidPasswordNum = "Password is not correct. The password must contain a number.";
    String sInvalidPasswordSC = "Password is not correct. The password must contain a special character.";
    String sGoToLogIn = "Go to log in";
    String sValidLogIn = "Log in was successful.";
    String sLogInPasswordInValid = "The password you used is incorrect.";
    String sLogInUsernameInValid = "The username you used is incorrect.";
    String sWelcomeUser = "Welcome: ";
    String sWelcomeToKanban = "Welcome to EastKanban";
       
    
    /*public st10439055_poe(){
    sUsername = "Nic_F";
    sPassword = "J4mes@me";
    }*/
    
    public void setUsername(String Username) {
    sUsername = Username;    
    }
    
    public void setPassword(String Password) {
    sPassword = Password;    
    }
    
    public void setName(String Name) {
    sName = Name;    
    }
    
    public void setSurename(String Surename) {
    sSurename = Surename;    
    }
    
    public String getUsername() {
    return sUsername;    
    }
    
    public String getPassword() {
    return sPassword;    
    }
    
    public String getName() {
    return sName;    
    }
    
    public String getSurename() {
    return sSurename;    
    }
    
    public String getValidUsername() {
    return sValidUsername;    
    }
    
    public String getValidPassword() {
    return sValidPassword;    
    }
    
    public String getInvalidUsernameUnder() {
    return sInvalidUsernameUnder;    
    }
    
    public String getInvalidUsernameLength() {
    return sInvalidUsernameLength;    
    }
    
    public String getInvalidPasswordLenth() {
    return sInvalidPasswordLenth;    
    }
    
    public String getInvalidPasswordCaps() {
    return sInvalidPasswordCaps;    
    }
    
    public String getInvalidPasswordNum() {
    return sInvalidPasswordNum;    
    }
    
    public String getInvalidPasswordSC() {
    return sInvalidPasswordSC;    
    }
    
    public String getGoToLogIn() {
    return sGoToLogIn;
    }
    
    public String getValidLogIn() {
    return sValidLogIn;    
    }
    
    public String getLogInPasswordInValid() {
    return sLogInPasswordInValid;    
    }
    
    public String getLogInUsernameInValid() {
    return sLogInUsernameInValid;
    }
    
     public String getWelcomeUser() {
    return sWelcomeUser;    
    }
    
     public String getWelcomeToKanban() {
    return sWelcomeToKanban;    
    }
    
    
    
    }//end

