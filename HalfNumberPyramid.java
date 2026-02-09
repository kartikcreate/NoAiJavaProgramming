import java.util.Scanner;
public class HalfNumberPyramid {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of lines for pyramid");
    int n=s.nextInt();
        int i;
    int j;
    int m;
        for(i=1;i<n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
                
            }
            System.out.println("");

    }
    }
    
}
