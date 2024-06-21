public class FullTimeStaff extends Person 
{
    
private double salary;

public FullTimeStaff(double salary) {
    this.salary = salary;
}

public FullTimeStaff(String name, int age, String email, String phone_number, String sex, String address,
        double salary) {
    super(name, age, email, phone_number, sex, address);
    this.salary = salary;
}

public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}
@Override
public void print() 
{
super.print();
System.out.println(" Salary : " + salary);
}
@Override
public void input() 
{
    super.input();
    System.out.println("Enter the Salary : ");
    salary = scanner.nextDouble();
}

 

}
