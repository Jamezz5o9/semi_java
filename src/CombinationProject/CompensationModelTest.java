package CombinationProject;

public class CompensationModelTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ola", "Ayo", "7684-2345", new SalariedCompensationModel(400));
        Employee employee2 = new Employee("Ajoke", "Freedom", "234-890-546", new HourlyCompensationModel(200, 42));
        Employee employee3 = new Employee("Itunu", "Ade", "564-982", new CommissionCompensationModel(0.6,  3000));
        Employee employee4 = new Employee("Itunu", "Ade", "564-982", new BasePlusCommissionCompensationMode(0.6,  3000, 300));

        System.out.printf("%s%n%n", employee1);
        System.out.printf("%s%n%n", employee2);
        System.out.printf("%s%n%n", employee3);
        System.out.printf("%s%n%n", employee4);

        employee2.setCompensationModel(new CommissionCompensationModel(1000, .7));
        System.out.println(employee2);
    }
}
