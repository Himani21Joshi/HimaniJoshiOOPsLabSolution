package service;
import java.util.Random;
import model.Employee;
public class CredentialService 
{
    public char[] generatePassword()
    {
        String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";  
        String smallLetters="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String specialCharacters="!@#$%^&*()_+=/-";
        
        String values=capitalLetters+smallLetters+numbers+specialCharacters;
        Random random=new Random();
        char[]password=new char[10];
        for(int i=0; i<password.length; i++)
        {
            password[i]=values.charAt(random.nextInt(values.length()));
        }
        return password;
    }
    public String generateEmailAddress(String firstName,String lastName,String department)
    {
        String email=firstName+lastName+"@"+department+".abc.com";
        return email;
    }
    public void showCredentials(Employee e, String email, char[]password)
    {
        System.out.println("Dear " + e.getFirstName() + " your generated credentials are as follows");
        System.out.println("Email--> " + email);
        System.out.print("Password--> ");
        System.out.println(password);
    }
}
