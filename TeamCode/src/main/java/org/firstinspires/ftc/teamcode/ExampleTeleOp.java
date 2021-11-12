package org.firstinspires.ftc.teamcode;

public class ExampleTeleOp extends ExampleAbstract{

    @Override
    public void init() {
        initializeHardware();
    }

    @Override
    public void loop() {
        lf.setPower(gamepad1.left_stick_y);
        lb.setPower(gamepad1.left_stick_y);
        rf.setPower(gamepad1.right_stick_y);
        rb.setPower(gamepad1.right_stick_y);

        if (gamepad2.right_bumper){
            servo.setPosition(.7);
        }

        if (gamepad2.left_bumper){
            servo.setPosition(.5);
        }
    }
}
