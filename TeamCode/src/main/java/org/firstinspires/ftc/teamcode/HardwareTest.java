package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Aidan Tan on 9/15/2017.
 */

public class HardwareTest {
    public DcMotor fRight = null;
    public DcMotor fLeft = null;
    public DcMotor bRight = null;
    public DcMotor bLeft = null;

    private DcMotor.RunMode initialMode = null;

    HardwareMap mapj = null;

    public HardwareTest(DcMotor.RunMode enteredMode)
    {
        initialMode = enteredMode;
    }

    public void init(HardwareMap aMap) {
        map = aMap;
        fRight = map.dcMotor.get("fRight_drive");
        fLeft = map.dcMotor.get("fLeft_drive");
        bRight = map.dcMotor.get("bRight_drive");
        bLeft = map.dcMotor.get("bLeft_drive");
        // encoders
        fRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        fLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        bRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        bLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        //All
        fRight.setMode(initialMode);
        bRight.setMode(initialMode);
        fLeft.setMode(initialMode);
        bLeft.setMode(initialMode);

        fRight.setDirection(DcMotorSimple.Direction.REVERSE);
        bRight.setDirection(DcMotorSimple.Direction.FORWARD);
        fLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        bLeft.setDirection(DcMotorSimple.Direction.REVERSE);

        stopRobot();
    }
    public void stopRobot()
    {
        fRight.setPower(0);
        fLeft.setPower(0);
        bRight.setPower(0);
        bLeft.setPower(0);

    }


}
