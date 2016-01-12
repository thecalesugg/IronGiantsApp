package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by FirstUser_2 on 11/18/2015.
 */
public class IronGiants_Auto extends LinearOpMode {
    DcMotor leftMotor;
    DcMotor leftMotor2;
    DcMotor rightMotor;
    DcMotor rightMotor2;

    @Override
    public void runOpMode() throws InterruptedException {

        leftMotor = hardwareMap.dcMotor.get("left_drive");
        leftMotor2 = hardwareMap.dcMotor.get("left_drive2");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        rightMotor2 = hardwareMap.dcMotor.get("right_drive2");

        leftMotor.setDirection(DcMotor.Direction.REVERSE);
        leftMotor2.setDirection(DcMotor.Direction.REVERSE);


        waitForStart();



        for (int i=0; i<1; i++) {

            leftMotor.setPower(1);
            leftMotor2.setPower(1);
            rightMotor.setPower(1);
            rightMotor2.setPower(1);

            sleep(1550);

            leftMotor.setPower(-1);
            leftMotor2.setPower(-1);
            rightMotor.setPower(1);
            rightMotor2.setPower(1);
            sleep(730);

            leftMotor.setPower(1);
            leftMotor2.setPower(1);
            rightMotor.setPower(1);
            rightMotor2.setPower(1);

            sleep(2300);

            leftMotor.setPower(-.5);
            leftMotor2.setPower(-.5);
            rightMotor.setPower(.5);
            rightMotor2.setPower(.5);
            sleep(360);

            leftMotor.setPower(.5);
            leftMotor2.setPower(.5);
            rightMotor2.setPower(.5);
            rightMotor.setPower(.5);

            sleep(1000);


        }
        leftMotor.setPowerFloat();
        leftMotor2.setPowerFloat();
        rightMotor.setPowerFloat();
        rightMotor2.setPowerFloat();
    }
}

/* From Cale and Kate
* We love you and believe in you and are so proud
* of what you have accomplished. Keep it up!
*  Love Cale and Kate
*  P.S this is a comment and will not affect your program
* */
