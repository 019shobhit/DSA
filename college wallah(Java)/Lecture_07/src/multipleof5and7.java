//Write the first multiple of 5 which is also a multiple of 7.
public class multipleof5and7 {
    public static void main(String[] args) {
        int i=1;
        while(true){
            if(i%5==0 && i%7==0){
                System.out.println("number is " + i);
                break;
            }
            i++;
        }
    }
}
