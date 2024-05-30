/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package st10439055;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
/**
 *
 * @author nicho
 */
public class ST10439055_MainTest {
    
    ST10439055_Main Tests = new ST10439055_Main();
    
    public ST10439055_MainTest() {
    }
    
  @Test
  public void taskTaskDiscriptionTrue() {
     
      Boolean Correct = true;
      Boolean Dyscription = ST10439055_Main.checkTaskDiscription("this is a description ");
      assertEquals(Correct,Dyscription);
      
     

  }
}
    


  
  

