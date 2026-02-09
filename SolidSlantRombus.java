import java.util.Scanner;

public class SolidSlantRombus {
    
    public static void main(String[] args) {
        int number = 1;
         Scanner s=new Scanner(System.in);
         System.out.println("enter the space needed");
    int n=s.nextInt();
    System.out.println("enter the length of the ");
    int m=s.nextInt();
    for(int i=0;i<=n;i++){
        for(int j=0;j<=n-i;j++){
            System.out.print(" ");

        }
        for(int k=1;k<=m;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
