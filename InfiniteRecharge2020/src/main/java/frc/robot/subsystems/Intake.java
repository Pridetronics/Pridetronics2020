/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants;


public class Intake extends SubsystemBase {
  /**
   * Creates a new Intake.
   */
  private static Talon intakeMotorLeft = Constants.intakeMotorLead;
  private static Talon intakeMotorRight = Constants.intakeMotorFollow;
  public Intake() {
    //Collect power cell balls
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void intake()
  {
    SmartDashboard.putBoolean("Intake", true);
    intakeMotorLeft.set(.55);
  }
  public void outtake()
  {
    intakeMotorLeft.set(-.55);
  }
  public void stop(){
    intakeMotorLeft.set(0);
    }
}
