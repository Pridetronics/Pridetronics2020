/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.Talon;
import com.revrobotics.CANSparkMax;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
   /* public static Talon intakeMotorExternal;
    public static Talon intakeMotorVertical;  */
    public static CANSparkMax intakeMotorExternal;
    public static CANSparkMax intakeMotorVertical;

    {

   // intakeMotorExternal = new Talon(5);
    intakeMotorExternal = new CANSparkMax(1, null);
    intakeMotorExternal.setInverted(true); 
    intakeMotorExternal.set(0); 
    
    //intakeMotorVerticalLeft = new Talon(6);
    intakeMotorVertical = new CANSparkMax(2, null);
    intakeMotorVertical.setInverted(true);
    intakeMotorVertical.set(0);
    

  

    }
}

