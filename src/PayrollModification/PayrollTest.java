package PayrollModification;

public class PayrollTest {

    public static void main(String[] args) {
        Employee[] employee = new Employee[]{
                new CommissionEmployee("James", "Ade", "334-874", 0.4, 2000),
                new HourlyEmployee("Amez", "Adeniyi",  "444-897", 200, 41),
                new SalariedEmployee("James", "Adeniyi", "222-444-55",5000),
                new BasePlusCommissionEmployee("Favour", "Aduloju","333-980",0.6, 2000, 400),
                new PieceWorker("James", "Adeniyi", "666-888", 10, 300)
        };

        for(Employee employees : employee){
            System.out.printf("%n%s %n%s: $%,.2f%n",employees, "Workers earning", employees.earnings());
        }

    }
}
