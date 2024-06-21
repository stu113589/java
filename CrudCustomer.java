import java.util.ArrayList;
import java.util.Scanner;

public class CrudCustomer {
    private ArrayList<Customer> customer_data = new ArrayList<Customer>();
    Scanner scanner = new Scanner(System.in);
public CrudCustomer() 
{
    Customer c1 = new Customer("Amjad", 42, "alam@gmail.com" ,"111111" , "MAle", "London",230.45);
    Customer c2 = new Customer("Amjad1", 43, "alam2@gmail.com" ,"222222" , "MAle", "London",330.45);
    Customer c3 = new Customer("Amjad2", 44, "alam2gmail.com" ,"333333","MAle", "London",430.45);
 customer_data.add(c1); 
 customer_data.add(c2); 
 customer_data.add(c3); 
}

    public void insert() 
    {
        Customer new_data = new Customer();
        new_data.input();
        customer_data.add(new_data);
        System.out.println(" Customer Data added successfully...");
    }
    public void modify(Customer data) 
    {
        try {
        System.out.println(" Please Input the Details of data you want to modify ");
        data.print();
        Customer new_data = new Customer();
        System.out.println(" Enter new Details now ...");
        new_data.input();
        customer_data.add(new_data);
        customer_data.remove(data);
        System.out.println("Customer Data modified successfully...");
        }
        catch(Exception e) 
        {
            System.out.println(" Something went wrong...");
        }
    }
    public void retrieve()
    {
        System.out.println(" Enter the phone number: ");
        String entered_phone = scanner.nextLine();
        boolean found=false;
        for(Customer x: customer_data) 
        {
            if (x.getPhone_number().equals(entered_phone))
            {
            found=true;
            x.print();
            break;
            }
        }
        if (found == false)
        System.out.println(" Sorry dataild not Found....");

    }
public void delete() 
{
System.out.println(" Enter the phone number: ");
        String entered_phone = scanner.nextLine();
    boolean found=false;
        for(Customer x: customer_data) 
        {
            if (x.getPhone_number().equals(entered_phone))
            {
            found=true;
            x.print();
            System.out.println(" Are you sure to delete... (Y/N)");
            String response = scanner.nextLine();
            if (response.toLowerCase()=="Y")
            {
                customer_data.remove(x);
                System.out.println("Data deleted successfully...");
            }
            break;
            }
        }
        if (found == false)
        System.out.println(" Sorry dataild not Found....");

}

}
