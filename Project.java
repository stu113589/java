import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        CrudCustomer crud_customer = new CrudCustomer();
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
        Menu.main_menu();
        int choice = scanner.nextInt();
        if (choice==1) 
        {
            Menu.customer_menu();
            int customer_choice = scanner.nextInt();
            if (customer_choice == 1) 
            {
                crud_customer.insert();
            }
            if (customer_choice == 2) 
            {
                crud_customer.retrieve();                
            }
            if (customer_choice == 3) 
            {
               
                //  crud_customer.modify(data);
            }
            if (customer_choice == 4) 
            {
                crud_customer.delete(); 
                
            }
        }
        if (choice==2) 
        {
            Menu.staff_menu();
        }
        if (choice==3) 
        {}
        if (choice==4) 
        {}
        if (choice==5) 
        {
            break;
        }

        }  // End of main While
        scanner.close();
    }  // End of main
} // End of project class
