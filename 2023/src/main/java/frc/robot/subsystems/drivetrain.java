package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class drivetrain extends SubsystemBase{

    public static Spark frontLeftMotor = new Spark(Constants.frontLeftMotor);
    public static Spark frontRightMotor = new Spark(Constants.frontRightMotor);
    public static Spark backLeftMotor = new Spark(Constants.backLeftMotor);
    public static Spark backRightMotor = new Spark(Constants.backRightMotor);

    public static MotorControllerGroup leftMotorGroup = new MotorControllerGroup(frontLeftMotor, backLeftMotor); 
    public static MotorControllerGroup rightMotorGroup = new MotorControllerGroup(frontRightMotor, backRightMotor);

    public static DifferentialDrive drive = new DifferentialDrive(frontLeftMotor, frontRightMotor);

    public drivetrain() {}

    public void arcadeDrive(double speed, double rotation) {
        drive.arcadeDrive(speed, rotation);
    }

    public void stop() {
        drive.stopMotor();
    }
}
