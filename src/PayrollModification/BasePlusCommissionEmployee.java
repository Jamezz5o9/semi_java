package PayrollModification;

public class BasePlusCommissionEmployee extends CommissionEmployee{

  private double baseSalary;


    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, commissionRate, grossSales);
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be > 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be > 0.0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings(){
        return super.earnings() + getBaseSalary();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
