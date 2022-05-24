// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  private CANSparkMax frontLeft, rearLeft, frontRight, rearRight;

  private MecanumDrive mDrive;
  /** Creates a new DriveTrain. */
  public DriveTrain() {
    frontLeft = new CANSparkMax(Constants.frontLeftID, MotorType.kBrushless);
    rearLeft = new CANSparkMax(Constants.rearLeftID, MotorType.kBrushless);
    frontRight = new CANSparkMax(Constants.frontRightID, MotorType.kBrushless);
    rearRight= new CANSparkMax(Constants.rearRightID, MotorType.kBrushless);

    frontLeft.restoreFactoryDefaults();
    rearLeft.restoreFactoryDefaults();
    frontRight.restoreFactoryDefaults();
    rearRight.restoreFactoryDefaults();
    frontRight.setInverted(true);
    rearRight.setInverted(true);
    
    mDrive = new MecanumDrive(frontLeft, rearLeft, frontRight, rearRight);
    mDrive.setSafetyEnabled(true);
  }

  public void drive(double ySpeed, double xSpeed, double zRotation) {

    mDrive.driveCartesian(-ySpeed*.55, xSpeed*.4, zRotation*.4);

  }

  public void stop() {
    frontLeft.set(0);
    rearLeft.set(0);
    frontRight.set(0);
    rearRight.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
