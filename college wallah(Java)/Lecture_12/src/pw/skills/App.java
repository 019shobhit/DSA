package pw.skills;

public class App {
     String str1 = "I am a Public Member";

    void printclass(){
        System.out.println("Within Class: "+str1);
    }
    public static void main(String[] args) {
        App obj = new App();
        obj.printclass();
        System.out.println("Within Class: "+obj.str1);
        App2 obj2 = new App2();
        obj2.outsideclass();

    }
}
class App2{
    void outsideclass(){
        App obj = new App();
        System.out.println("Within Package but Outside class: "+obj.str1);
    }
}
