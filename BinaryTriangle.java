import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        int number = 1;
         Scanner s=new Scanner(System.in);
         System.out.println("enter the number of lines for binary pyramid");
    int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if (j%2==0) {
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
  System.out.println("");
            }
            
            
        }
        
    }
    