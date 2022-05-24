// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Intake;

public class IntakeWheels extends CommandBase {
  /** Creates a new Intake. */
  private Intake intake;
  private double intakeSpeed;
  
  public IntakeWheels(Intake sub) {
    // Use addRequirements() here to declare subsystem dependencies.
    intakeSpeed = 0.0;
    intake = sub;
    addRequirements(sub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    boolean RB = RobotContainer.controller.getRawButton(Constants.RButton);
    boolean LB = RobotContainer.controller.getRawButton(Constants.LButton);
    if (RB) {
      intakeSpeed = Constants.intakespeed;
    } else if (LB) {
      intakeSpeed = -Constants.intakespeed;
    } else {
      intakeSpeed = 0.0;
    }
     RobotContainer.intake.setMotors(intakeSpeed);
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
