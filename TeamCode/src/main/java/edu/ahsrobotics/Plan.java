package edu.ahsrobotics;

import java.util.ArrayList;
import java.util.Iterator;

public class Plan {
    static ArrayList <PlanElement> plan;

    public Plan(){
        plan = new ArrayList<PlanElement>();
    }

    public void addPlanElement(PlanElement p){

        plan.add(p);
    }

    public Iterator<PlanElement> iterator() {
        return plan.iterator();
    }

}
