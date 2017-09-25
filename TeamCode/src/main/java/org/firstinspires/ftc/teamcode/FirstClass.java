package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Eli on 9/14/2017.
 */

public class FirstClass extends LinearOpMode{
    //it is lit my dudes

    //This comment is for a test
    HardwareTest robot = new HardwareTest(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(robot.map);

        telemetry.addData("Say", "Hello Driver");
        telemetry.update();

        waitForStart();
        while(opModeIsActive())
        {
            robot.bLeft.setPower(1);
            robot.fLeft.setPower(1);
            robot.bRight.setPower(1);
            robot.fRight.setPower(1);

            sleep(1000);
        }
    }

}
