
package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by FirstUser_2 on 11/9/2015.
 */
public class IronGiantsStart extends OpMode {






    DcMotor leftMotor;
    DcMotor rightMotor;

    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);}

        public void loop () {

        float leftY = -gamepad1.left_stick_y;
        float rightY = -gamepad1.right_stick_y;


        leftMotor.setPower(rightY);
        rightMotor.setPower(leftY);}


    }


