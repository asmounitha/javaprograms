class Animal{
 void sound(){
    System.out.println("The animal makes a sound");
 }
 class dog extends Animal{
    void sound(){
        System.out.println("the dog barks");
    }
 }
}
public class main2{
    public static void main(String[]args){
Animal a=new Animal();
a.sound();
    }
}