package edu.ahsrobotics;

import java.util.Timer;

public class Chassis implements MotionRunner {

    private DriveUnit RightFront;
    private DriveUnit LeftFront;
    private DriveUnit RightBack;
    private DriveUnit LeftBack;

    public Chassis(){
        this.RightFront= new DriveUnit(1,4,"RightFront",false);
        this.LeftFront= new DriveUnit(1,4,"LeftFront",true);
        this.RightBack= new DriveUnit(1,4,"RightBack",false);
        this.LeftBack= new DriveUnit(1,4,"LeftBack",true);
    }



    public void init(){
        RightFront.init();
        LeftFront.init();
        LeftBack.init();
        RightBack.init();
    }

    public void execute(Motion m){

        double s_location = RightBack.getPosition();
        StraightMotion s = (StraightMotion) m;
        double test_distance = s.getDistance();

        //RightBack.zeroDistance();
        RightBack.setPower(s.getMotorPower());
        LeftBack.setPower(s.getMotorPower());
        RightFront.setPower(s.getMotorPower());
        LeftFront.setPower(s.getMotorPower());

        FTCUtilities.OpSleep(2000);

        RightBack.setPower(0);
        LeftBack.setPower(0);
        RightFront.setPower(0);
        LeftFront.setPower(0);
    }

}
