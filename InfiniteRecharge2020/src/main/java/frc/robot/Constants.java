/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;

import com.revrobotics.CANSParkaMax.*;
import com.revrobotics.CANSparkMaxLowLevel.*;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.revrobotics.CANPIDController;

import com.revrobotics.ControlType;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */

 ////////////////////////////////////////////////////
public final class Constants {

public static DifferentialDrive driveRobot;// Creates new differential drive

public static CANSparkMax leftDriveMotorLead;// Creates new talon motor for leading Left Drive

public static CANSparkMax leftDriveMotorFollow;// Creates new talon motor for following Left Drive

public static CANSparkMax rightDriveMotorLead;// Creates new talon motor for leading Right Drive

public static CANSparkMax rightDriveMotorFollow;/// Creates new talon motor for following Right Drive

/////////////////////////////////////////////////////
public static void init() {

leftDriveMotorLead = new CANSparkMax(0, null); // Assigns Leading Left Drive Motor to Talon #0

leftDriveMotorLead.setInverted(true); // Inverts Leading Left Drive Motor
leftDriveMotorLead.set(0); // Sets speed to 0 (anywhere between -1 and 1)

leftDriveMotorFollow = new CANSparkMax(1, null); // Assigns Following Left Drive Motor to Talon #1
leftDriveMotorFollow.setInverted(true); // Inverts Following Left Drive Motor

// Makes the Following Left Drive Motor to follow the Leading left Drive Motor
leftDriveMotorFollow.follow(leftDriveMotorLead);
// Converts Leading left Drive Motor to an Encoder
//leftDriveMotorLead.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, kTimeoutMs);

rightDriveMotorLead = new CANSparkMax(2, null); // Assigns Leading Right Drive Motor to Talon #2
rightDriveMotorLead.setInverted(true); // Inverts Leading Right Drive Motor
rightDriveMotorLead.set(0); // Sets speed to 0 (anywhere between -1 and 1)

rightDriveMotorFollow = new CANSparkMax(3, null); // Assigns Following Right Drive Motor to Talon #3
rightDriveMotorFollow.setInverted(true); // Inverts Following Left Drive Motor

// Makes the Following Right Drive Motor to follow the Leading Right Drive Motor
rightDriveMotorFollow.follow(rightDriveMotorLead);
// Converts Leading Right Drive Motor to an Encoder
//rightDriveMotorLead.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, kTimeoutMs);

// Assigns myRobot To a new Differential Drive Object that uses The Leading
// Motors
driveRobot = new DifferentialDrive(leftDriveMotorLead, rightDriveMotorLead);

// LiveWindow.addAcutator("Drive", "robotDrive", myRobot);
driveRobot.setSafetyEnabled(false);
driveRobot.setExpiration(0.1);
driveRobot.setMaxOutput(1.0);

// lift motors

// Lift Motor to a new CANSparkMAX object


}