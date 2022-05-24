// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.IntakeWheels;

public class Intake extends SubsystemBase {
  /** Creates a new Teeth. */
  private CANSparkMax motor;
  
  public Intake() {
    motor = new CANSparkMax(Constants.intakeID, MotorType.kBrushless);
    motor.restoreFactoryDefaults();
    this.setDefaultCommand(new IntakeWheels(this));
  }

  public void setMotors(double speed) {
    motor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
