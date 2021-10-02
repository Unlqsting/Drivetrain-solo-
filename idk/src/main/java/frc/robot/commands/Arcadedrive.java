// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class Arcadedrive extends CommandBase {
      private final Drivetrain m_drive;
      
      private final DoubleSupplier m_forward;
      
      private final DoubleSupplier m_rotation;
      
       {
	}

  public Arcadedrive(Drivetrain drive, DoubleSupplier forward, DoubleSupplier rotation) {
        m_drive = drive;
        m_forward = forward;
        m_rotation = rotation;
        addRequirements(m_drive);
   
  }

  


// Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
