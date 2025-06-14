// Print all the values between 1 and 50 except for the multiple of 3.
public class Skippmulti3 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i%3==0){
                continue;
            }
            System.out.printf("%d \t",i);
        }
    }
}
