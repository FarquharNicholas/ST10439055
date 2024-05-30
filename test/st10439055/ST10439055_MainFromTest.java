/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package st10439055;

import st10439055.st10439055;
import st10439055.st10439055;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 *
 * @author nicho
 */
public class ST10439055_MainFromTest {
    
    public ST10439055_MainFromTest() {
         ST10439055_Main TestTasks = new ST10439055_Main();
    }
  
   @Test
  public void taskTaskDiscriptionTrue() {
     
      Boolean Correct = true;
      Boolean Dyscription = ST10439055_Main.checkTaskDiscription("this is a description ");
      assertEquals(Correct,Dyscription);
      
     

  }
      /*    
  public void taskTaskDiscriptionTrue() {
      String Discryption = "1111111111222222222233333333334444444444";
      
      PROG5121_ST10439055 TestTasks = new PROG5121_ST10439055();
      checkTaskDiscription(Discryption);
  }
  
  public void testTaskIDtrue() {
      String TaskID = "";
      
      PROG5121_ST10439055 TestTasks = new PROG5121_ST10439055();
      checkTaskDiscription(Discryption);
  }
  
    public void testTaskIDtrue() {
      String TaskID = "";
      
      PROG5121_ST10439055 TestTasks = new PROG5121_ST10439055();
      checkTaskDiscription(Discryption);
  }
  */
  
}
