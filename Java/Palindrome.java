package Java;
import java.util.Scanner;

public class Palindrome {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int rev=0;
        int temp;
        System.out.println("Enter the number to be checked :");
        int num = scan.nextInt();
        int numcpy = num;
        while(num>0){
            temp=num%10;
            rev=(rev*10)+temp;
            num/=10;
        }
        if(numcpy == rev){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
