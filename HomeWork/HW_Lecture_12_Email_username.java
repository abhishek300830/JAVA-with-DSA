package HomeWork;
import java.util.Scanner;
/*
Input an email from the user. You have to create a username from the email by
deleting the part that comes after ‘@’. Display that username to the user.
Example :
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
email = “helloWorld123@gmail.com”; username = “helloWorld123”
*/
public class HW_Lecture_12_Email_username {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Email ID :");
        String email=sc.next();
        String userName="";
        sc.close();
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                userName+=email.charAt(i);
            }
        }
        System.out.println("\nUser Name : "+userName);
    }
}
