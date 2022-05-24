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
import frc.robot.commands.MoveMouth;

public class Mouth extends SubsystemBase {
  /** Creates a new Mouth. */
  private CANSparkMax motor;

  public Mouth() {

    motor = new CANSparkMax(Constants.mouthID, MotorType.kBrushless);
    motor.restoreFactoryDefaults();
   // motor = new VictorSPX(Constants.mouthID);
    this.setDefaultCommand(new MoveMouth(this));

  }

  public void setMotors(double speed) {
    motor.set(speed);
  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
