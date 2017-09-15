package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
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

    HardwareMap map = null;

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
        //fRight.setMode();
    }
}
