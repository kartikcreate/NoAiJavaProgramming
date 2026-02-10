import java.util.Scanner;

public class MultiplyMthdEx {
    public static int multiplication(int i,int j){
        int multiply=i*j;
        return multiply;

    }
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
            System.out.println("enter i");

        int i =s.nextInt();
        System.out.println("enter j");
        int j =s.nextInt();
        int multiply=multiplication(i,j);
        System.out.println("product of numbers:"+multiply);
    }
    
}
