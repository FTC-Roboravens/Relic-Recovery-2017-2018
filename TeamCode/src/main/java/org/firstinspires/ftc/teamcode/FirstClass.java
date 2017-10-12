package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**DcMotor.RunMode.RUN_WITHOUT_ENCODER
 * Created by Eli on 9/14/2017.
 */
@Autonomous(name="AutoRobot", group ="Robo1")
public class FirstClass extends LinearOpMode{
    //it is lit my dudes


    //This comment is for a test
    HardwareTest robot = new HardwareTest(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap);

        telemetry.addData("Say", "Hello Driver");
        telemetry.update();

        waitForStart();
        while(opModeIsActive())
        {
            //forward
            moveForward(1000);
            //backwards
            moveBackward(1000);
            //right
            moveRight(1000);
            //left
            moveLeft(2000);
            //right
            moveRight(1000);
            //backwards
            moveBackward(1000);
            //forward
            moveForward(1000);
        }


    }
    public void moveForward(int time)
    {
        robot.bLeft.setPower(1);
        robot.fLeft.setPower(1);
        robot.bRight.setPower(1);
        robot.fRight.setPower(1);
        sleep(time);
    }
    public void moveBackward(int time)
    {
        robot.bLeft.setPower(-1);
        robot.fLeft.setPower(-1);
        robot.bRight.setPower(-1);
        robot.fRight.setPower(-1);
        sleep(time);
    }
    public void moveRight(int time)
    {
        robot.bLeft.setPower(-1);
        robot.fLeft.setPower(1);
        robot.bRight.setPower(1);
        robot.fRight.setPower(-1);
        sleep(time);
    }
    public void moveLeft(int time)
    {
        robot.bLeft.setPower(1);
        robot.fLeft.setPower(-1);
        robot.bRight.setPower(-1);
        robot.fRight.setPower(1);
        sleep(time);
    }
}
