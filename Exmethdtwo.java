import java.util.Scanner;

public class Exmethdtwo {
    public static int calculateSum(int i,int j){
        int sum=i+j;
        return sum;
    }
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
            System.out.println("enter i");

        int i =s.nextInt();
        System.out.println("enter j");
        int j =s.nextInt();
       int sum= calculateSum(i, j);//calling the function
 System.out.print("summ of the given numbers is:"+ sum);

}
}