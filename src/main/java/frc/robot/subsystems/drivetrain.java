package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class drivetrain extends SubsystemBase{

    public static Spark frontLeft = new Spark(Constants.frontLeft);
    public static Spark frontRight = new Spark(Constants.frontRight);
    public static Spark backLeft = new Spark(Constants.backLeft);
    public static Spark backRight = new Spark(Constants.backRight);

    public static MotorControllerGroup leftMotors = new MotorControllerGroup(frontLeft, backLeft);
    public static MotorControllerGroup rightMotors = new MotorControllerGroup(frontRight, backRight);

    public static DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

    public drivetrain() {
        
    }

    public void arcadeDrive(double speed, double rotation) {
        drive.arcadeDrive(speed, rotation);
    }

    public void stop() {
        drive.stopMotor();
    }
}
