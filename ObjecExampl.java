package oops;
class Pen {
  String color;
    String type;
    public void write(){
        System.out.println("inside method calling");
    }
    public void printColor(){
     System.out.println(this.color);
    }
}
public class ObjecExampl {
  
public static void main(String[] args) {
    Pen pen1 =new Pen();
    pen1.color="blue";
    pen1.type="gel";
    pen1.write();
    Pen pen2 =new Pen();
    pen2.color="black";
    pen2.type="ball";
    pen2.write();
    pen1.printColor();
    pen2.printColor();
}

}

