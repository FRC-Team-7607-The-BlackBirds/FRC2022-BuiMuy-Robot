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
import frc.robot.commands.MoveHookUp;

public class Hook extends SubsystemBase {
  /** Creates a new Hook. */
  private VictorSPX hookMotor;
  private VictorSPX ropeMotor;

  public Hook() {
    hookMotor = new VictorSPX(Constants.hookMotorID);
    ropeMotor = new VictorSPX(Constants.ropeMotorID);

    this.setDefaultCommand(new MoveHookUp(this));
    
  }

  public void setHook(double speed) {
    hookMotor.set(ControlMode.PercentOutput, speed);
  }

  public void setRope(double speed) {
    ropeMotor.set(ControlMode.PercentOutput, speed);
  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
