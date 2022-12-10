package frc.robot.Auton;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Auton.AutonCommands.timedDrive;
import frc.robot.Auton.AutonCommands.timedTurn;
import frc.robot.subsystems.drivetrain;

public class Autonomous extends SequentialCommandGroup{
    public Autonomous(drivetrain drive, double drivespeed, double turnspeed, double firstdrivetime,
        double turntime, double seconddrivetime) {
            super(
                new timedDrive(drive, drivespeed, firstdrivetime));
                // new timedTurn(drive, turnspeed, turntime),
                // new timedDrive(drive, drivespeed, seconddrivetime));
        }
}
