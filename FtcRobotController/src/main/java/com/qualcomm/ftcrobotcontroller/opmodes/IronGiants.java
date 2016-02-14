package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Iron Giants on 11/9/2015.
 *
 * Why can't you trust atoms
 * They make up everything :):):):)
 *
 */
public class IronGiants extends OpMode {

    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor armBase;
    DcMotor armExtension;
    Servo armservo;
    Servo clawservo;
    Servo clawservo2;
    Servo rightclimber;
    Servo leftclimber;

    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        armBase = hardwareMap.dcMotor.get("armbase");
        armExtension = hardwareMap.dcMotor.get("armextend");
        armExtension.setDirection(DcMotor.Direction.REVERSE);
        armservo = hardwareMap.servo.get("armservo");
        clawservo = hardwareMap.servo.get("clawservo");
        clawservo2 = hardwareMap.servo.get("clawservo2");
        rightclimber = hardwareMap.servo.get("rightclimber");
        leftclimber = hardwareMap.servo.get("leftclimber");


    }

    @Override
    public void loop() {

        float leftY = -gamepad1.left_stick_y;
        float rightY = -gamepad1.right_stick_y;
        float leftY2 = -gamepad2.left_stick_y;
        float rightY2 = -gamepad2.right_stick_y;


        leftMotor.setPower(rightY);
        rightMotor.setPower(leftY);
        armBase.setPower(leftY2);
        armExtension.setPower(rightY2);

        final double arm_position_up = 1.0;
        final double arm_position_open = 0.3;
        final double arm_position_down = 0.0;
        final double claw_position_open = 0.0;
        final double claw_position_open2 = 1.0;
        final double claw_position_closed = 0.0;
        final double claw_position_closed2 = 1.0;
        final double claw_position_half = 0.6;
        final double claw_position_half2 = .25;
        final double leftclimber_position_open = 1.0;
        final double leftclimber_position_closed = 0.55;
        final double rightclimber_position_open = 1.0;
        final double rightclimber_position_closed = 0.5;


        if (gamepad2.dpad_up) {
            armservo.setPosition(arm_position_up);
            }
        if (gamepad2.dpad_right)
            armservo.setPosition(arm_position_open);

        if (gamepad2.dpad_down) {
            armservo.setPosition(arm_position_down);
        }
        if (gamepad2.a) {
            clawservo.setPosition(claw_position_open);
            clawservo2.setPosition(claw_position_open2);
        }
        if (gamepad2.y) {
            clawservo.setPosition(claw_position_closed2);
            clawservo2.setPosition(claw_position_closed);
        }
        if (gamepad2.b) {
            clawservo.setPosition(claw_position_half);
            clawservo2.setPosition(claw_position_half2);
        }
        if (gamepad1.dpad_down) {
            leftclimber.setPosition(leftclimber_position_closed);
        }
        if (gamepad1.dpad_up) {
            leftclimber.setPosition(leftclimber_position_open);
        }
        if (gamepad1.a) {
            rightclimber.setPosition(rightclimber_position_closed);
        }
        if (gamepad1.y) {
            rightclimber.setPosition((rightclimber_position_open));
        }

    }
}
