 import java.util.Scanner;
public class ArraySearch {
   


    int size;
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

        int key=3;
        System.out.println("enter size of array");
        int size=s.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<=size-1;i++)
        {
             System.out.println("next element");
         numbers[i]=s.nextInt();
        }
        for(int i=0;i<=size-1;i++){
if(numbers[i]==key){
    System.out.println("x found at index"+i);
}
    }
    }
    }