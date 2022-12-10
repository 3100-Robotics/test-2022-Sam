// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Auton.Autonomous;
import frc.robot.commands.MOVEARM;
import frc.robot.commands.VROOM;
import frc.robot.subsystems.arm;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.drivetrain;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  public drivetrain drive = new drivetrain();
  public arm arm = new arm();

  public XboxController driveController = new XboxController(0);
  public XboxController coDriveController = new XboxController(1);

  // button work //

  public final JoystickButton toggleclaw = new JoystickButton(coDriveController, Constants.IOConstants.xButtonChannel);
  public final JoystickButton armup = new JoystickButton(coDriveController, Constants.IOConstants.yButtonChannel);
  public final JoystickButton armdown = new JoystickButton(coDriveController, Constants.IOConstants.aButtonChannel);

  public InstantCommand clawCommand = new InstantCommand(
    () -> arm.toggleClaw(),
  arm);

  public StartEndCommand clawupCommand = new StartEndCommand(
    () -> arm.runarm(0.4),
    () ->arm.runarm(0.05),
  arm);

  public StartEndCommand clawdownCommand = new StartEndCommand(
    () -> arm.runarm(-0.2),
    () -> arm.runarm(0.0),
  arm);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    drive.setDefaultCommand(new VROOM(drive, driveController));
    arm.setDefaultCommand(new MOVEARM(arm, coDriveController));
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@lind then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.nk
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), a
   */
  private void configureButtonBindings() {
    toggleclaw.whenPressed(clawCommand);
    // armup.whenPressed(clawupCommand);
    // armdown.whenPressed(clawdownCommand);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    // drive speed, turn speed, 1st drive time, turn time, 2nd drive time
    return new Autonomous(drive, 0.5, 0.5, 2, 3, 3);
  }
}
