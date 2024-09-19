import java.util.Scanner;
import java.util.regex.Pattern;


public class accounts {
    account.acc[] accountArray;
    int numberOfAccounts;
    
    
    public void createAccounts() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number of Accounts: ");
        numberOfAccounts = sc.nextInt();
        sc.nextLine();  

        accountArray = new accounts.acc[numberOfAccounts];
        
        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println("Enter details for Account " + (i + 1) + ":");
            
            System.out.print("First Name: ");
            String firstName = sc.nextLine();
            
            System.out.print("Last Name: ");
            String lastName = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.nextLine();
            
            System.out.print("Username: ");
            String username = sc.nextLine();
            
            String password;
            do {
                System.out.print("Password: ");
                password = sc.nextLine();
            } while (validatePasswordWithInt(password) == 0);  
            
            accountArray[i] = new accounts().new acc(i + 1, firstName, lastName, email, username, password);
            System.out.println("Account created successfully!\n");
        }
    }
    
   
    public int validatePasswordWithInt(String password) {
        if (password.length() < 😎 {
            System.out.println("Password must be at least 8 characters long.");
            return 0;  
        }
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            System.out.println("Password must contain at least one uppercase letter.");
            return 0;
        }
        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            System.out.println("Password must contain at least one lowercase letter.");
            return 0;
        }
        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            System.out.println("Password must contain at least one number.");
            return 0;
        }
        if (!Pattern.compile("[^a-zA-Z0-9]").matcher(password).find()) {
            System.out.println("Password must contain at least one special character.");
            return 0;
        }
        if (password.equalsIgnoreCase("admin") || password.equalsIgnoreCase("password") || password.equals("123")) {
            System.out.println("Password cannot be a common password such as 'admin', 'password', or '123'.");
            return 0;
        }
        return 1;  
    }

   
    public void displayAccounts() {
       
        System.out.printf("%-5s %-10s %-10s %-20s %-15s %-10s%n", "ID", "First Name", "Last Name", "Email", "Username", "Password");
        System.out.println("--------------------------------------------------------------------------------------------");
        
      
        for (int i = 0; i < numberOfAccounts; i++) {
            accounts.acc account = accountArray[i];
            System.out.printf("%-5d %-10s %-10s %-20s %-15s %-10s%n",
                    account.id, account.FirstName, account.LastName, account.Email, account.Username, account.Password);
    
    
}

    
}
}



 