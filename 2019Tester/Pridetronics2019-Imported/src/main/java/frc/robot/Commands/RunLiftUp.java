/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
import frc.robot.Robot;
import frc.robot.Subsystems.Lift;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.DigitalInput;

/**
 * This class creates a command to run lift up.
 */
public class RunLiftUp extends Command {

  public final DigitalInput limitSwitchLiftDown = RobotMap.limitSwitchLiftDown;
  public final DigitalInput limitSwitchLiftUp = RobotMap.limitSwitchLiftUp;

  public RunLiftUp() {

    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);

    requires(Robot.lift);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //if (Robot.lift.limitSwitchUpOpen()) {
      Robot.lift.up();
    //}
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    //if (Robot.lift.limitSwitchUpOpen()) {
      return false;
    //}
    //return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.lift.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
