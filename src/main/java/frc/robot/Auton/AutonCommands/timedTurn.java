package frc.robot.Auton.AutonCommands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivetrain;

public class timedTurn extends CommandBase{
        public drivetrain drive;
        public double speed, wantedTime, startTime;
    
        public timedTurn(drivetrain theDrive, double theSpeed, double theTime) {
            drive = theDrive;
            speed = theSpeed;
            wantedTime = theTime;
        }
    
        @Override
        public void initialize() {
            startTime = Timer.getFPGATimestamp();
        }
    
        @Override
        public void execute() {
            drive.arcadeDrive(0.0, speed);
        }
    
        @Override
        public boolean isFinished() {
            double currentTime = Timer.getFPGATimestamp();
            if (currentTime - startTime >= wantedTime) {
                return true;
            }
            return false;
        }
    
        @Override
        public void end(boolean interupted) {
            drive.arcadeDrive(0.0, 0.0);
        }
    }
