/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.smartdashboard.*;

/**
 * Add your docs here.
 */
public class ZeroEncoder extends InstantCommand {
  /**
   * Add your docs here.
   */
  public ZeroEncoder() {
    super();
  }

  @Override
  protected void initialize() {
    
    SmartDashboard.putString("Autonomous", "Zeroing Encoder");
    Robot.smEnhanced.setOffset();
  }

}
