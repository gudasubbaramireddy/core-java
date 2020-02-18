package designpatterns.factorymethodpattran;

import java.io.IOException;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory factory=new GetPlanFactory();
        Plan plan = factory.getPlan("DOMESTICPLAN");
        System.out.print("Bill amount for DOMESTICPLAN of  "+10+" units is: ");
        plan.getRate();
        plan.calculateBill(10);
    }
}
