package org.usfirst.frc.team4043.robot.subsystems;

import org.usfirst.frc.team4043.robot.Robot;
import org.usfirst.frc.team4043.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class JawsOfDeath extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void moveJODUp() {
		RobotMap.jodMover1.set(.3);
		RobotMap.jodMover2.set(.3);
	}
	
	public void moveJODDown() {
		RobotMap.jodMover1.set(-.3);
		RobotMap.jodMover2.set(-.3);
	}
	
	public void clampJOD() {
		RobotMap.jodClamper.set(false);
	}
	
	public void unclampJOD() {
		RobotMap.jodClamper.set(true);
	}
	
	public void stopMotors() {
		RobotMap.jodMover1.set(0);
		RobotMap.jodMover2.set(0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

