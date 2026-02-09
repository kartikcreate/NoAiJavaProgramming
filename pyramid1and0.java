import java.util.Scanner;

public class pyramid1and0 {

          public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         System.out.println("enter the number of lines for 10 pyramid pyramid");
    int n=s.nextInt();
    for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int k= i+j;
                if (k%2==0) {
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