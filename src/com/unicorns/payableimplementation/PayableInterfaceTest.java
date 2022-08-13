package com.unicorns.payableimplementation;
public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payable = new Payable[]{
                new Invoice("456-879", "Greatest", 4, 40),
                new Invoice("342-890", "Longest", 8, 35),
                new Employee("James", "Nord", "345-657", new SalariedCompensationModel(300)),
                new Employee("Albert", "Isaac", "888-111", new SalariedCompensationModel(700))
        };

        for(Payable curPayable: payable){
            System.out.printf("%s%n%s: $%,.2f%n", curPayable, "Payment due", curPayable.getPaymentAmount());

        }


    }
}
