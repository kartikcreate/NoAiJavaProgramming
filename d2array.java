import java.util.Scanner;

public class d2array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int cols =s.nextInt();
        int rows =s.nextInt();
        int  [][] array1 =new int [rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array1[i][j]= s.nextInt();

            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
            System.out.println(array1[i][j]);
        }
        System.out.println("");
    }
    
}
}