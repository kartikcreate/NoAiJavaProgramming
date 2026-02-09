import java.util.Scanner;
public class HalfinvertedNumPyramid 
    

{
    public static void main(String[] args) {
        
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of lines for pyramid");
    int n=s.nextInt();
        int i;
    int j;
    for(i=n;i>=0;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);
                
            }
            System.out.println("");

    }
    }
}     
    


