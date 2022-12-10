package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class arm extends SubsystemBase{
    
    public static Solenoid armPiston = new Solenoid(PneumaticsModuleType.CTREPCM, Constants.armPistonChannel);
    public static Solenoid clawPiston = new Solenoid(PneumaticsModuleType.CTREPCM, Constants.clawPistonChannel);

    public arm() {

    }

    public static void toggleArm() {
        armPiston.toggle();
    }

    public static void toggleClaw() {
        clawPiston.toggle();
    }
}
