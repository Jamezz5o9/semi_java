package PayableModification;

public class PayrollTest {

    public static void main(String[] args) {
        Payable[] payable = new Payable[]{
                new Invoice("01234", "seat", 2, 375.00),
                new Invoice("56789", "tire", 4, 79.95),
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
                new HourlyEmployee("Demilade", "Ireoluwa", "564-908-123", 4000, 23),
                new CommissionEmployee("Anuoluwapo", "Temiloluwa", "234-894-908", 0.5, 4000),
                new BasePlusCommissionEmployee("Remi", "Seun", "675-908-143", 0.8, 5000, 400)

        };

        for(Payable payables : payable){
            System.out.printf("%s%n", payables);


            if (payables instanceof BasePlusCommissionEmployee){
                    BasePlusCommissionEmployee newPayable = (BasePlusCommissionEmployee) payables;
                    newPayable.setBaseSalary(1.10 * newPayable.getBaseSalary());

                System.out.printf("%s: $%,.2f%n","The new base salary with 10% increase is", newPayable.getBaseSalary());
            }
            System.out.printf("Amount paid: $%,.2f%n%n", payables.getPaymentAmount());
        }

        for(int i = 0; i < payable.length; i++){
            System.out.printf("Payable %d is a %s%n",i, payable[i].getClass().getName());
        }
    }


}
