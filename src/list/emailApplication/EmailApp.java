package list.emailApplication;

import java.util.Scanner;

public class EmailApp {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailBoxCapacity=500;
    private String alternateEmail;
    private String companySuffix = "aeycompany.am";

    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    private String setDepartment() {
        System.out.println("New worker: "+firstName+"\nDepartment code\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the Department code");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else {
            if (depChoice == 2) {
                return "dev";
            } else {
                if (depChoice == 3) {
                    return "acct";
                } else {
                    return "";
                }
            }
        }

    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHGJHLKOIUJH245245826525526$#%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rend = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rend);

        }
        return new String(password);
    }

    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
    public void changPassword(){
        this.password=password;
    }
    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "DISPLAY NAME: "+firstName+" "+lastName+
                "\nCOMPANY EMAIL: "+email+
                "\nMAILBOX CAPACITY: "+mailBoxCapacity+"mb";
    }
}
