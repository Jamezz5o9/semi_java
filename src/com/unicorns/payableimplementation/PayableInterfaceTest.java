package com.unicorns.payableimplementation;
public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payable = new Payable[]{
                new Invoice("456-879", "Greatest", 4, 40),
                new Invoice("342-890", "Longest", 8, 35),
                new Employee("James", "Noard", "345-657", new SalariedCompensationModel(300))
        };

        for(Payable curPayable: payable){
            System.out.printf("%s", curPayable);
        }

        //System.out.println();
    }
}
