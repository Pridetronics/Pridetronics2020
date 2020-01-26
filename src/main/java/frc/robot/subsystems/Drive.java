/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import frc.robot.Commands.*;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.RobotContainer;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.SpeedController;

public class Drive extends SubsystemBase {
  /**
   * Creates a new Drive.
   */
   

  public DifferentialDrive robotDrive;
  public int driveMode;

  private CANSparkMax leftDriveMotor;
  private CANSparkMax rightDriveMotor;
 
  public Drive(int leftDriveMotorAddress, int rightDriveMotorAddress) {

    driveMode = 0;

    // Enables movement through the field using west coast driv
    
    

    leftDriveMotor = new CANSparkMax(leftDriveMotorAddress, MotorType.kBrushless);
    leftDriveMotor.setInverted(true); 
    leftDriveMotor.set(0); 

    rightDriveMotor = new CANSparkMax(rightDriveMotorAddress, MotorType.kBrushless); // Assigns Leading Right Drive Motor to Talon #2
    rightDriveMotor.setInverted(true); // Inverts Leading Right Drive Motor
    rightDriveMotor.set(0); // Sets speed to 0 (anywhere between -1 and 1)
    
    robotDrive = new DifferentialDrive(leftDriveMotor, rightDriveMotor);

    SmartDashboard.putString("Drive Mode:", "Tank");
                                                                                                              
  }



public void setDrive() {
    /*
    if (driveMode == 0) {
      driveMode = 1;
      SmartDashboard.putString("Drive Mode", "Arcade");
    } 

    
    else {
      driveMode = 0;
      SmartDashboard.putString("Drive Mode", "Tank");
    }
    */
  }

  public void initDefaultCommand() {
    //setDefaultCommand(new DriveTeleop());
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void doTeleop() {    
  }



  public void tankDrive(double leftValue, double rightValue) {


  }

}
