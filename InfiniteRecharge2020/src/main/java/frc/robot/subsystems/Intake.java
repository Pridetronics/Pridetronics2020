/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Talon;

public class Intake extends SubsystemBase {
  /**
   * Creates a new Intake.
   */
  public Joystick gamepad1 = new Joystick(0);


  private static Talon intakeMotorExternal = Constants.intakeMotorExternal;
  private static Talon intakeMotorVerticalLeft = Constants.intakeMotorVerticalLeft;
  private static Talon intakeMotorVerticalRight = Constants.intakeMotorVerticalRight;
 
  public Intake() {
    //Collect power cell balls
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void intakeExternal()
  {
    SmartDashboard.putBoolean("Intake External", true);
    intakeMotorExternal.set(.55);
  }
  public void intakeVertical()
  {
    SmartDashboard.putBoolean("Intake Vertical", true);
    intakeMotorVerticalLeft.set(.55);
    intakeMotorVerticalRight.set(55);

  }
  public void stop(){
    intakeMotorExternal.set(0);
    }
}
