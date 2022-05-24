// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Hook;

public class MoveHookUp extends CommandBase {
  /** Creates a new MoveHook. */
  
  private Hook hook;
  private CANSparkMax hookMotor;
  private CANSparkMax ropeMotor;
  private double speed;
  
  
  public MoveHookUp(Hook sub) {
    // Use addRequirements() here to declare subsystem dependencies.
    
    speed = 0.0;
    hook = sub;
    addRequirements(sub);
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    /*
    boolean joystickbutton = RobotContainer.js.getRawButton(1);
    boolean joystickbutton2 = RobotContainer.js.getRawButton(2);

    if (joystickbutton) {
      speed = Constants.hookspeed;
    } else if (joystickbutton2) {
      speed = -Constants.hookspeed;
    } else {
      speed = 0.0;
    }

    RobotContainer.hook.setMotors(speed);
    */

    double hookspeed = RobotContainer.js.getRawAxis(1);
    boolean hookin = RobotContainer.js.getRawButton(1);
    boolean hookout = RobotContainer.js.getRawButton(2);

    if (hookspeed > 0) {
      RobotContainer.hook.setHook(-0.8*hookspeed);
    } else if (hookspeed < 0) {
      RobotContainer.hook.setHook(-0.8*hookspeed);
    } else {
      RobotContainer.hook.setHook(0);
    }

    if (hookin) {
      speed = Constants.hookspeed;
    } else if (hookout) {
      speed = -Constants.hookspeed;
    } else {
      speed = 0.0;
    }

    RobotContainer.hook.setRope(speed);
    
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
