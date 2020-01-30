/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotMap;

/**
 * .
 */
public class Shooter extends SubsystemBase{
    private WPI_TalonFX shooter;
    private WPI_TalonSRX lock5; 

    public Shooter() {

        shooter = new WPI_TalonFX(RobotMap.SHOOTER_ID);
        lock5 = new WPI_TalonSRX(RobotMap.LOCK_FIVE_MOTOR_ID);
        shooter.configOpenloopRamp(1);
    
    }

    public void shoot(){
         move(Constants.SHOOTER_SPEED);
    }

    private void move(double speed) {
        shooter.set(speed);
    }

    public void stop(){
        shooter.stopMotor();
    }

    @Override 
    public void periodic() {

    }
}

