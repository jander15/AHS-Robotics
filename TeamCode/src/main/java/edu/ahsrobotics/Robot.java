package edu.ahsrobotics;

import java.util.Iterator;

public class Robot {
    private Chassis chassis;

    public Robot(){
        this.chassis = new Chassis();
    }

    public Chassis getChassis(){
        return chassis;
    }

    public void init(){
        chassis.init();
    }

    public void executePlan(Plan p){
        Iterator<PlanElement> iterator = p.iterator();
        while(iterator.hasNext()){

            //Do something...for now send elements to the chassis
            PlanElement e = iterator.next();
            e.execute();

        }
    }

}
