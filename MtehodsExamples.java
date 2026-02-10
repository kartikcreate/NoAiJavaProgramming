

 import java.util.Scanner;
public class MtehodsExamples {
   

    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name=s.next();
        printMyName(name);// calling the function
    }
    
}

