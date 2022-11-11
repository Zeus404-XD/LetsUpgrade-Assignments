package Java;
import java.util.Scanner;
public class Operations{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        double result;
                dispMenu();
                int option = getOption();
                switch(option){
                    case 1:
                        result = add();
                        System.out.print(result);
                        break;
                    case 2:
                        result = sub();
                        System.out.print(result);
                        break;
                    case 3:
                        result = mul();
                        System.out.print(result);
                    case 4:
                        result = div();
                        System.out.print(result);
                    }

    }

    static void dispMenu(){
        System.out.println("=======================================================");
        System.out.println("  Welcome To Mathametical operations of Two Numbers");
        System.out.println("=======================================================");
        System.out.println("1.Addition");
        System.out.println("2.Subraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

    }

    static int getOption(){
        System.out.print("Enter Your Choice :");
        return scan.nextInt();
    }

    static double add(){
        System.out.print("Enter the 1st Num: ");
        double one = scan.nextDouble();
        System.out.print("Enter the 2nd Num: ");
        double two = scan.nextDouble();
        System.out.print("The Addition of "+one+" and "+two+" is ");
        return one+two;
    }

    static double sub(){
        System.out.print("Enter the 1st Num: ");
        double one = scan.nextDouble();
        System.out.print("Enter the 2nd Num: ");
        double two = scan.nextDouble();
        System.out.print("The Subraction of "+one+" and "+two+" is ");
        return one-two;
    }
    static double mul(){
        System.out.print("Enter the 1st Num: ");
        double one = scan.nextDouble();
        System.out.print("Enter the 2nd Num: ");
        double two = scan.nextDouble();
        System.out.print("The Multiplication of "+one+" and "+two+" is ");
        return one*two;
    }
    static double div(){
        System.out.print("Enter the 1st Num: ");
        double one = scan.nextDouble();
        System.out.print("Enter the 2nd Num: ");
        double two = scan.nextDouble();
        System.out.print("The Division of "+one+" and "+two+" is ");
        return one/two;
    }
}