/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
// RobotContainer replaces OI (Note to Lucky for future references)
package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.Drive;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

//import edu.wpi.first.wpilibj2.command.button.JoystickButton; //Deals with the buttons on the controller
import edu.wpi.first.wpilibj.Joystick; //Allows gamepad/joystick referencing


//import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
//import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//import edu.wpi.first.wpilibj.SpeedControllerGroup;



/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  //private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  //private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  
  public Joystick joystickDriver;
  public Joystick joystickShooter;
    
  public final Drive robotDrive;


  //private final SpeedController leftDriveMotor;
  //private final SpeedController rightDriveMotor;
  
  public RobotContainer() {
    this.joystickDriver = new Joystick(0); // 'this.' Grabs a variable specifically
    this.joystickShooter = new Joystick(1); // ^^ Creates less confusion in the system
    

    /*
    leftDriveMotor = new CANSparkMax(1, MotorType.kBrushless);
    leftDriveMotor.setInverted(true); 
    leftDriveMotor.set(0); 

    rightDriveMotor = new CANSparkMax(2, MotorType.kBrushless);
    rightDriveMotor.setInverted(true); // Inverts Leading Right Drive Motor
    rightDriveMotor.set(0); // Sets speed to 0 (anywhere between -1 and 1)
    */
    
    
    robotDrive = new Drive(1, 2); 
 
  //Joystick gamepadJoystick = new Joystick(0);

  //JoystickButton leftJoystickButton = new JoystickButton(gamepadJoystick, 0);
  //JoystickButton rightJoystickButton = new JoystickButton(gamepadJoystick, 1);


  
    // Configure the button bindings
    configureButtonBindings();

    



  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    //final JoystickButton switchDriveMode = new JoystickButton(null, 8);


  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return getAutonomousCommand();
  }
}
