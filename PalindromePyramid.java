    import java.util.Scanner;
public class PalindromePyramid {



    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         System.out.println("enter the number of line for pyramid");
    int n=s.nextInt();
    for(int i=0;i<=n;i++){
        for(int j=0;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=i;k>1;k--){
            System.out.print(k);
        }
        for(int k=1;k<=i;k++){
            System.out.print(k);
        }

        System.out.println("");
}
    }
}