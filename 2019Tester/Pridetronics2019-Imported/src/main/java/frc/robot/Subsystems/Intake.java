/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Intake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private static Victor intakeMotorLeft = RobotMap.intakeMotorLead;
  //private static Victor intakeMotorRight = RobotMap.intakeMotorFollow;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  @Override
  public void periodic() {

  }

  public void intake() {
    SmartDashboard.putBoolean("Intake", true);
    intakeMotorLeft.set(.55);
    // intakeMotorRight.set(1);
  }

  public void outtake() {
    intakeMotorLeft.set(-.55);
    // intakeMotorRight.set(-1);
  }

  public void stop() {
    intakeMotorLeft.set(0);
  }
}
