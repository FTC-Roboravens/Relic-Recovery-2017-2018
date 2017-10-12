package org.firstinspires.ftc.teamcode;

//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Aidan Tan on 9/15/2017.
 */
//@TeleOp(name="Hardware", group ="Robo1")
public class HardwareTest {
    public DcMotor fRight;
    public DcMotor fLeft;
    public DcMotor bRight;
    public DcMotor bLeft;

    private DcMotor.RunMode initialMode;

    HardwareMap map;

    public HardwareTest(DcMotor.RunMode enteredMode)
    {
        initialMode = enteredMode;
    }

    public void init(HardwareMap aMap) {
        map = aMap;
        fRight = map.dcMotor.get("fRight");
        fLeft = map.dcMotor.get("fLeft");
        bRight = map.dcMotor.get("bRight");
        bLeft = map.dcMotor.get("bLeft");
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

        fRight.setDirection(DcMotorSimple.Direction.FORWARD);
        bRight.setDirection(DcMotorSimple.Direction.FORWARD);
        fLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        bLeft.setDirection(DcMotorSimple.Direction.REVERSE);
//aidan is  gAYYYE
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
