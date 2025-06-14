
class data{
    int rollNo ;
    String Name;
}
public class student {
    public static void main(String[] args) {
        data shobhit = new data();
        shobhit.Name="Shobhit";
        shobhit.rollNo=1;
        System.out.println(shobhit.rollNo);
        System.out.println(shobhit.Name);

        data obj2 = new data();
        obj2.Name="Vikhayat";
        obj2.rollNo=2;
        System.out.println(obj2.rollNo);
        System.out.println(obj2.Name);

    }
}
