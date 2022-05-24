// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    
    //Motors
    public static final int frontLeftID = 4;
    public static final int rearLeftID = 1;
    public static final int frontRightID = 2;
    public static final int rearRightID = 3;   
    public static final int shooterMotorID = 5;
    public static final int mouthID = 6;
    public static final int intakeID = 7;
    public static final int hookMotorID = 8;
    public static final int ropeMotorID = 9;

    //Joysticks
    public static final int xAxisJ1 = 0;
    public static final int yAxisJ1 = 1;
    public static final int xAxisJ2 = 4;

    //Speeds
    public static final double shooterspeed = 0.5;
    public static final double intakespeed = 0.3;
    public static final double hookspeed = 1;

    //Buttons
    public static final int buttonB = 2; //Shooter
    public static final int buttonA = 1;
    public static final int buttonY = 4;
    public static final int buttonX = 3;

    public static final int RButton = 6; //intake
    public static final int LButton = 5; //intake

    //Triggers
    public static final int RTrigger = 3; //Mouth up
    public static final int LTrigger = 2; //mouth down
}
