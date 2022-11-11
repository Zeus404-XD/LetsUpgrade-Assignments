package Java;

public class Divisible {
    public static void main(String[] args){
        System.out.println("The Numbers which is divisible by 23 b/w 10 to 150 are:");
        for(int i =10;i<=150;i++){
            if(i%23==0){
                System.out.println(i);
            }
        }
    }
}
