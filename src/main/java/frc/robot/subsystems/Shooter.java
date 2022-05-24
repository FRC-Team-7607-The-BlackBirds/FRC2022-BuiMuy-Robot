// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.ShootBall;


public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */
  private CANSparkMax motor;

  public Shooter() {
    motor = new CANSparkMax(Constants.shooterMotorID, MotorType.kBrushless);

    motor.restoreFactoryDefaults();
    
    this.setDefaultCommand(new ShootBall(this));
  }

  public void setMotor(double speed) {
    motor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
