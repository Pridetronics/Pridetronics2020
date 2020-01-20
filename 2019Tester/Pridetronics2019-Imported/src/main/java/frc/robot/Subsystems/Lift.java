/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
import frc.robot.Commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Encoder;

/**
 * Add your docs here.
 */
public class Lift extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private final CANSparkMax liftMotor = RobotMap.liftMotor;
  private final DigitalInput limitSwitchLiftDown = RobotMap.limitSwitchLiftDown;
  private final DigitalInput limitSwitchLiftUp = RobotMap.limitSwitchLiftUp;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  @Override
  public void periodic() {
    // Put code here to be run every loop

  }

  public void up() {
    SmartDashboard.putBoolean("lift", true);
    liftMotor.set(.55);
  }

  public void upSpeed(double speed) {
    liftMotor.set(speed);
  }

  public void stallAtTop() {
    liftMotor.set(0.2);
  }

  public void down() {
    SmartDashboard.putBoolean("lift", false);
    liftMotor.set(-.40);
  }

  public void stop() {
    liftMotor.set(0);
  }

  public Encoder getArmEncoder() {
    return RobotMap.ArmEncoder;
  }

  public boolean limitSwitchUpOpen() {
    return limitSwitchLiftUp.get();
  }

  public boolean limitSwitchDownOpen() {
    return limitSwitchLiftDown.get();
  }

}
