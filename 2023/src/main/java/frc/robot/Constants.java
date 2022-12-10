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

    // drivetrain constants
    public final static int frontLeftMotor = 0;
    public final static int frontRightMotor = 0;
    public final static int backLeftMotor = 0;
    public final static int backRightMotor = 0;

    // arm constants
    public final static int armPistonChannel = 0;
    public final static int clawPistonChannel = 0;

    public static final class IOConstants {
        // === XBOX CHANNELS === //
        // AXES
        public static final int leftXAxisChannel = 0;
        public static final int leftYAxisChannel = 1;
        public static final int leftTriggerChannel = 2;
        public static final int rightTriggerChannel = 3;
        public static final int rightXAxisChannel = 4;
        public static final int rightYAxisChannel = 5;
  
        // BUTTONS
        public static final int aButtonChannel = 1;
        public static final int bButtonChannel = 2;
        public static final int xButtonChannel = 3;
        public static final int yButtonChannel = 4;
  
        public static final int leftBumperChannel = 5;
        public static final int rightBumperChannel = 6;
  
        public static final int backButtonChannel = 7;
        public static final int startButtonChannel = 8;
  
        public static final int POVU = 0;
        public static final int POVR = 90;
        public static final int POVD = 180;
        public static final int POVL = 270;
     }
}
