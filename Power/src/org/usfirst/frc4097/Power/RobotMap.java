// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4097.Power;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainleftMotor;
    public static SpeedController driveTrainrightMotor;
    public static RobotDrive driveTrainRobotDrive;
    public static SpeedController elevatorSpeedController1;
    public static DigitalInput elevatorLimitSwitchElevator;
    public static SpeedController boxTransfersideMotor;
    public static SpeedController boxTransfermidMotor;
    public static DigitalInput boxTransferLimitSwitchBox1;
    public static DigitalInput boxTransferLimitSwitchBox2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainleftMotor = new VictorSP(0);
        LiveWindow.addActuator("driveTrain", "leftMotor", (VictorSP) driveTrainleftMotor);
        
        driveTrainrightMotor = new VictorSP(1);
        LiveWindow.addActuator("driveTrain", "rightMotor", (VictorSP) driveTrainrightMotor);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainleftMotor, driveTrainrightMotor);
        
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);

        elevatorSpeedController1 = new VictorSP(2);
        LiveWindow.addActuator("Elevator", "Speed Controller 1", (VictorSP) elevatorSpeedController1);
        
        elevatorLimitSwitchElevator = new DigitalInput(0);
        LiveWindow.addSensor("Elevator", "Limit Switch Elevator", elevatorLimitSwitchElevator);
        
        boxTransfersideMotor = new VictorSP(3);
        LiveWindow.addActuator("BoxTransfer", "sideMotor", (VictorSP) boxTransfersideMotor);
        
        boxTransfermidMotor = new VictorSP(4);
        LiveWindow.addActuator("BoxTransfer", "midMotor", (VictorSP) boxTransfermidMotor);
        
        boxTransferLimitSwitchBox1 = new DigitalInput(1);
        LiveWindow.addSensor("BoxTransfer", "Limit Switch Box 1", boxTransferLimitSwitchBox1);
        
        boxTransferLimitSwitchBox2 = new DigitalInput(2);
        LiveWindow.addSensor("BoxTransfer", "Limit Switch Box 2", boxTransferLimitSwitchBox2);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
