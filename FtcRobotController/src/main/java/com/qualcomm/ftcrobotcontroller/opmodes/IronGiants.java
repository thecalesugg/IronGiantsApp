package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by FirstUser_2 on 11/9/2015.
 */
public class IronGiants extends OpMode {

    DcMotor leftMotor;
    DcMotor leftMotor2;
    DcMotor rightMotor;
    DcMotor rightMotor2;
    DcMotor armMotor1;
    DcMotor armMotor2;


    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        leftMotor2 = hardwareMap.dcMotor.get("left_drive2");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        rightMotor2 = hardwareMap.dcMotor.get("right_drive2");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        rightMotor2.setDirection(DcMotor.Direction.REVERSE);
        armMotor1 = hardwareMap.dcMotor.get("arm_drive1");
        armMotor2 = hardwareMap.dcMotor.get("arm_drive2");


    }

    @Override
    public void loop() {

        float leftY = -gamepad1.left_stick_y;
        float rightY = -gamepad1.right_stick_y;
        float leftY2 = -gamepad2.left_stick_y;

        leftMotor.setPower(rightY);
        leftMotor2.setPower(rightY);
        rightMotor.setPower(leftY);
        rightMotor2.setPower(leftY);
        armMotor2.setPower(leftY2);


        if (gamepad2.a) {
            armMotor2.setPower(.1);

        } else if (gamepad2.x) armMotor2.setPower(-.1);

        else {
            armMotor2.setPower(0);
        }


    }
}
