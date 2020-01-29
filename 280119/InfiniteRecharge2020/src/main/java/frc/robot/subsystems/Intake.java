/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Talon;
import com.revrobotics.CANSparkMax;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.smartdashboard.*;

public class Intake extends SubsystemBase {
  /**
   * Creates a new Intake.
   */
  
private static CANSparkMax intakeMotorExternal = Constants.intakeMotorExternal;
private static CANSparkMax intakeMotorVertical = Constants.intakeMotorVertical;
//private static Talon intakeMotorExternal = Constants.intakeMotorExternal;
//private static Talon intakeMotorVertical = Constants.intakeMotorVertical;
  public Intake() {
    //Collect power cell balls
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void intakeExternal()
{
  SmartDashboard.putBoolean("Intake", true);
  intakeMotorExternal.set(.55);
  intakeMotorVertical.set(.55);
}

public void stop(){
  intakeMotorExternal.set(0);
  intakeMotorVertical.set(0);
  }
}
