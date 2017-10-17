package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Aidan Tan on 10/5/2017.
 */
@TeleOp( name = "AutoRobot")
public class TeleOP extends LinearOpMode{
    HardwareTest robot = new HardwareTest(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    @Override
    public void runOpMode() throws InterruptedException
    {
        robot.init(hardwareMap);

        while(opModeIsActive())
        {
            //left stick for direction, right stick for rotation

            /*double r = gamepad1.right_stick_x;
            boolean up = gamepad1.y;
            boolean down = gamepad1.a;
            boolean open = gamepad1.x;
            boolean close = gamepad1.b;*/
            double y = gamepad1.left_stick_y;
            double x = gamepad1.left_stick_x;
            double slope = y/x;
            //right
            if((slope)<= Math.tan(22.5) && (slope) >= Math.tan(337.5))
            {
                robot.fRight.setPower(-x);
                robot.bRight.setPower(x);
                robot.fLeft.setPower(x);
                robot.bLeft.setPower(-x);
            }
            //diagonal right up
            else if((slope)> Math.tan(22.5) && (slope) < Math.tan(67.5))
            {
                robot.fRight.setPower(0);
                robot.bRight.setPower(2*x*Math.abs(y));
                robot.fLeft.setPower(2*x*Math.abs(y));
                robot.bLeft.setPower(0);
            }
            //up - complete next time
            if((slope)>= Math.tan(67.5) && (slope) <= Math.tan(112.5))
            {
                robot.fRight.setPower(x);
                robot.bRight.setPower(x);
                robot.fLeft.setPower(x);
                robot.bLeft.setPower(x);
            }
            //up left
            if((slope)> Math.tan(112.5) && (slope) < Math.tan(157.5))
            {
                robot.fRight.setPower(2*Math.abs(x)*Math.abs(y));
                robot.bRight.setPower(0);
                robot.fLeft.setPower(0);
                robot.bLeft.setPower(2*Math.abs(x)*Math.abs(y));
            }
            //left
            if((slope)>= Math.tan(157.5) && (slope) <= Math.tan(202.5))
            {
                robot.fRight.setPower(x);
                robot.bRight.setPower(-x);
                robot.fLeft.setPower(-x);
                robot.bLeft.setPower(x);
            }
            //back left
            if((slope)> Math.tan(202.5) && (slope) < Math.tan(247.5))
            {
                robot.fRight.setPower(2*x*y);
                robot.bRight.setPower(0);
                robot.fLeft.setPower(0);
                robot.bLeft.setPower(2*x*y);
            }
            //back
            if((slope)>=Math.tan(247.5) && (slope) <= Math.tan(292.5))
             {
            robot.fRight.setPower(-x);
            robot.bRight.setPower(-x);
            robot.fLeft.setPower(-x);
            robot.bLeft.setPower(-x);
             }
             //back right
            if((slope)>Math.tan(292.5) && (slope) < Math.tan(337.5))
            {
                robot.fRight.setPower(0);
                robot.bRight.setPower(2*x*y);
                robot.fLeft.setPower(2*x*y);
                robot.bLeft.setPower(0);
            }







               /* if (Math.abs(y) > Math.abs(x)) {
                    if (y > 0) {
                        moveForward(10);
                    } else if (y < 0){
                        moveBackward(10);
                    }
                } else {
                    if (x > 0) {
                        moveRight(10);
                    } else if (x < 0) {
                        moveLeft(10);
                    }
                }*/
            //um...something
            /*
            double frbl = x+y-r;
            double brfl = -x+y-r;
            */
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
    public void moveLeft(int time) {
        robot.bLeft.setPower(1);
        robot.fLeft.setPower(-1);
        robot.bRight.setPower(-1);
        robot.fRight.setPower(1);
        sleep(time);
    }

}
