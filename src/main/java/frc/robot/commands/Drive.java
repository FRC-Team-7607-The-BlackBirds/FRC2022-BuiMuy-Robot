// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class Drive extends CommandBase {
  /** Creates a new Drive. */
  private DriveTrain driveTrain;
  public Drive(DriveTrain sub) {
    // Use addRequirements() here to declare subsystem dependencies.
    driveTrain = sub;
    addRequirements(sub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double xSpeed = RobotContainer.controller.getRawAxis(Constants.xAxisJ1);
    double ySpeed = RobotContainer.controller.getRawAxis(Constants.yAxisJ1);
    double zRotation = RobotContainer.controller.getRawAxis(Constants.xAxisJ2);
    RobotContainer.driveTrain.drive(ySpeed, xSpeed, zRotation);
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
