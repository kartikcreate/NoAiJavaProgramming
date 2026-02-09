import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         System.out.println("enter the number of lines for butterfly wings");
    int n=s.nextInt();



      for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");

            }
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");

            }
           for(int j=1;j<=i;j++){
                System.out.print("*");

            }
             System.out.println("");
        }
       String butterfly1 = "\uD83E\uDD8B";
            System.out.println("butterfly"+butterfly1);

            for(int i=n;i>=1;i--){
                for(int j=i;j>=1;j--){
                    System.out.print("*");
                }
                for(int k=n-i;k>=1;k--){
                    System.out.print(" ");
                }
                for(int k=n-i;k>=1;k--){
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
             
      
        }
    }
    