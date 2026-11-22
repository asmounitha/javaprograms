class Calculator{
void add(int a,int b){
    System.out.println("adding two numbers:" + (a+b));
}
void add(int a,int b,int c){
    System.out.println("adding three numbers:" + (a+b+c));
}
void add(double a,double b){
    System.out.println("adding two double numbers:" + (a+b));
}
}
public class main1{
public static void main(String[]args){
    Calculator c = new Calculator();
    c.add(10,20);
    c.add(10,20,30);
    c.add(10.6,10.7);
}
}

