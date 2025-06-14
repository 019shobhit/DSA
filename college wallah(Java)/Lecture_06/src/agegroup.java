//Write a program to divide people into 3 age groups depending upon their age.
// Bellow 12  -->  Child
// Between 12 and 18  -->  Teenager
// Above  -->  Adult
import java.util.Scanner;
public class agegroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age:");
        int age = sc.nextInt();

        if(age<12){
            System.out.println("You are Child");
        } else if (age > 12 && age < 18) {
            System.out.println("You are Teenager");
        }
        else {
            System.out.println("You are Adult");
        }
    }
}
