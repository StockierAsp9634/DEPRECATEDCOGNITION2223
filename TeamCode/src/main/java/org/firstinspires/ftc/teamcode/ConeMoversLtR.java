package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;


@Autonomous(name="ConeMoverLtR", group="Autonomous")
public class ConeMoversLtR extends LinearOpMode {


    HardwarePushbot robot = new HardwarePushbot();   // Use a Pushbot's hardware
    private ElapsedTime runtime = new ElapsedTime();

    static final double TURN_SPEED = 0.25;

    @Override
    public void runOpMode() {

        /*
         * Initialize the drive system variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "Ready to run");    //
        telemetry.update();
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        StrafeRight(3000);
        sleep(1000);
        MoveForward(1000);
        sleep(1000);
        MoveBackward(1000);
        TurnRight(0);
        TurnLeft(0);
        StrafeLeft(0);



        StrafeRight(0);
    }
    //Motor 1: Normal
    //Motor 2: Normal
    //Motor 3: Normal
    //Motor 4: Reverse
    public void MoveForward(long timeoutS) {
        if (opModeIsActive()) {

            robot.setMotorPowers(TURN_SPEED, TURN_SPEED, TURN_SPEED, -TURN_SPEED, 0);
            runtime.reset();
            sleep(timeoutS);
            robot.setMotorPowers(0);
        }
    }

    public void TurnLeft(long timeoutB){

        if (opModeIsActive()){

            robot.setMotorPowers(-TURN_SPEED, -TURN_SPEED, -TURN_SPEED, -TURN_SPEED,0);
            runtime.reset();
            sleep(timeoutB);
            robot.setMotorPowers(0);
        }

    }
    public void TurnRight(long timeoutC){

        if (opModeIsActive()){

            robot.setMotorPowers(TURN_SPEED, TURN_SPEED, TURN_SPEED, TURN_SPEED,0);
            runtime.reset();
            sleep(timeoutC);
            robot.setMotorPowers(0);
        }

    }
    public void StrafeRight(long timeoutD) {

        if (opModeIsActive()) {

            robot.setMotorPowers(TURN_SPEED, -TURN_SPEED, -TURN_SPEED, -TURN_SPEED, 0);
            runtime.reset();
            sleep(timeoutD);
            robot.setMotorPowers(0);
        }
    }
    public void StrafeLeft(long timeoutE) {

        if (opModeIsActive()) {

            robot.setMotorPowers(-TURN_SPEED, TURN_SPEED, TURN_SPEED, TURN_SPEED, 0);
            runtime.reset();
            sleep(timeoutE);
            robot.setMotorPowers(0);

        }

    }


    public void MoveBackward(long timeoutF) {

        if (opModeIsActive()) {

            robot.setMotorPowers(-TURN_SPEED, -TURN_SPEED, -TURN_SPEED, TURN_SPEED, 0);
            runtime.reset();
            sleep(timeoutF);
            robot.setMotorPowers(0);

        }

    }




}



