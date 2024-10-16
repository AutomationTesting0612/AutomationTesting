package com.automation.designPattern.factoryDP.factoryclass;

import com.automation.designPattern.factoryDP.CommercialPlan;
import com.automation.designPattern.factoryDP.DomesticPlan;
import com.automation.designPattern.factoryDP.InstitutionalPlan;
import com.automation.designPattern.factoryDP.Plain;

public class PlainFactory {

    public Plain getPlain(String plain){
        if(plain==null){
            return null;
        } else if (plain.equals("DOMESTIC")) {
            return new DomesticPlan();
        } else if (plain.equals("COMMERCIAL")) {
            return new CommercialPlan();
        } else {
            return new InstitutionalPlan();
        }


    }
}
