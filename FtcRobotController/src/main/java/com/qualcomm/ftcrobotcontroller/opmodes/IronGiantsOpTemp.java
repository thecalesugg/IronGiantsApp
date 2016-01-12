package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

/**
 * Created by FirstUser_2 on 11/19/2015.
 */
public class IronGiantsOpTemp extends OpMode {
    DcMotor leftMotor;
    DcMotor leftMotor2;
    DcMotor rightMotor;
    DcMotor rightMotor2;

    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        leftMotor2 = hardwareMap.dcMotor.get("left_drive2");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        rightMotor2 = hardwareMap.dcMotor.get("right_drive2");
        leftMotor.setDirection(DcMotor.Direction.REVERSE);
        leftMotor2.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {

        float leftY = -gamepad1.left_stick_y;
        float rightY = -gamepad1.right_stick_y;

        leftMotor.setPower(leftY);
        leftMotor2.setPower(leftY);
        rightMotor.setPower(rightY);
        rightMotor2.setPower(rightY);
    }
}
