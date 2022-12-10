package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class arm extends SubsystemBase{
    
    public static Spark armMotor = new Spark(Constants.armMotor);

    public static Solenoid claw = new Solenoid(PneumaticsModuleType.CTREPCM, Constants.clawPiston);

    public arm() {
        
    }

    public void toggleClaw() {
        claw.toggle();
    }

    public void runarm(double speed) {
        armMotor.set(speed);
    }

    public void stoparm() {
        armMotor.stopMotor();
    }
}
