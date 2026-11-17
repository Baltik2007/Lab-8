//Oleksandra Chebotar
//17.11.26
//Lab 8
public class Employee extends Person
{
    private double annualSalary;

    public Employee(String name, double annualSalary)
    {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    public String getDescription()
    {
        return "An employee with a salary of \"" + annualSalary + "\"";
    }
}
