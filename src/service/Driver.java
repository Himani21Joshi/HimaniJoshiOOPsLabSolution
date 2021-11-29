package service;

import java.util.Scanner;
import model.Employee;

public class Driver 
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter Your FirstName");
        String firstName=in.nextLine();
        
        System.out.println("Enter Your LastName");
        String lastName=in.nextLine();
        
            Employee e=new Employee(firstName,lastName);
            System.out.println("Please enter the department from the following");
            System.out.println("1. Technical");
            System.out.println("2. Admin");
            System.out.println("3. Human Resource");
            System.out.println("4. Legal");

            int depChoice=in.nextInt();
            CredentialService cs=new CredentialService();
            
            String generatedEmail;
            char[] generatePassword;
            if(depChoice==1)
            {
                generatedEmail=cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(), "tech");
                generatePassword=cs.generatePassword();
                cs.showCredentials(e, generatedEmail, generatePassword);
            }
            else if(depChoice==2)
            {
                generatedEmail=cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(), "admin");
                generatePassword=cs.generatePassword();
                cs.showCredentials(e, generatedEmail, generatePassword);
            }
            else if(depChoice==3)
            {
                generatedEmail=cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(), "humanresource");
                generatePassword=cs.generatePassword();
                cs.showCredentials(e, generatedEmail, generatePassword);
            }
            else if(depChoice==4)
            {
                generatedEmail=cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(), "legal");
                generatePassword=cs.generatePassword();
                cs.showCredentials(e, generatedEmail, generatePassword);
            }
            else
            {
                System.out.println("Enter Valid Option");
            }
        }
    }