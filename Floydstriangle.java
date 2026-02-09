import java.util.Scanner;
public class Floydstriangle {
    public static void main(String[] args) {
        int number = 1;
         Scanner s=new Scanner(System.in);
         System.out.println("enter the number of lines for floyds pyramid");
    int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                    System.out.print(number+" ");
                    number++;

            }
            System.out.println("");
            
        }
        
    }
    
}
