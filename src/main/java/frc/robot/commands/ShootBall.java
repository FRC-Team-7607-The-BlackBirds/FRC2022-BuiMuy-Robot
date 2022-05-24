// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Shooter;

public class ShootBall extends CommandBase {
  /** Creates a new ShootBall. */
  private Shooter shooter;
  private double shooterspeed;

  public ShootBall(Shooter sub) {
    // Use addRequirements() here to declare subsystem dependencies.
    shooterspeed = 0.0;
    shooter = sub;
    addRequirements(sub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    boolean buttonB = RobotContainer.controller.getRawButton(Constants.buttonB);
    //boolean buttonA = RobotContainer.controller.getRawButton(Constants.buttonA);
    if (buttonB) {
      shooterspeed = -Constants.shooterspeed;
 /*   } else if (buttonA){
      shooterspeed = Constants.shooterspeed;
      */
    } else {
      shooterspeed = 0.0;
    }
    RobotContainer.shooter.setMotor(shooterspeed);
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
