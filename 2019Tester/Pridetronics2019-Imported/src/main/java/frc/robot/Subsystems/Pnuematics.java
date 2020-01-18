/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.*;

/**
 * Add your docs here.
 */
public class Pnuematics extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private final DoubleSolenoid solenoidHatchRelease = RobotMap.solenoidHatchRelease;
  private final DoubleSolenoid solenoidRampRelease = RobotMap.solenoidRampRelease;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  @Override
  public void periodic() {

  }

  public void releaseHatch() {
    solenoidHatchRelease.set(Value.kForward);
  }

  public void retractHatch() {
    solenoidHatchRelease.set(Value.kReverse);
  }

  public void retractRamp() {
    solenoidRampRelease.set(Value.kForward);
  }

  public void releaseRamp() {
    solenoidRampRelease.set(Value.kReverse);
  }
}
