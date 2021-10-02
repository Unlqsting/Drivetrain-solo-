// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

//imports
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

//codethingy
public class Drivetrain extends SubsystemBase {
  
  private WPI_VictorSPX m_leftFrontMotor = new WPI_VictorSPX(Constants.drive_lf);

  private WPI_TalonSRX m_leftBackMotor = new WPI_TalonSRX(Constants.drive_lb);

  public SpeedControllerGroup m_leftMotors = new SpeedControllerGroup(m_leftFrontMotor, m_leftBackMotor);
  
  
  private WPI_VictorSPX m_rightFrontMotor = new WPI_VictorSPX(Constants.drive_rf);

  private WPI_TalonSRX m_rightBackMotor = new WPI_TalonSRX(Constants.drive_rb);

  public SpeedControllerGroup m_rightMotors = new SpeedControllerGroup(m_rightFrontMotor, m_rightBackMotor);

  
  public DifferentialDrive m_drive = new DifferentialDrive(m_leftMotors, m_rightMotors);


  



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
