package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.arm;

public class MOVEARM extends CommandBase{
    private final arm m_arm;
    private final XboxController m_controller;

    public MOVEARM(arm subsystem, XboxController controller) {
        m_arm = subsystem;
        m_controller = controller;
        addRequirements(m_arm);
    }

    private double limit(double value) {
        if (value >= +0.1)
          return value;
    
        if (value <= -0.1)
          return value;
        
        return 0;
      }

    @Override
    public void execute() {
        double speed = -m_controller.getLeftY();

        m_arm.runarm(speed*0.4);
    }
}