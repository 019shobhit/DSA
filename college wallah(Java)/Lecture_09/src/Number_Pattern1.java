//        121212
//        212121
//        121212
//        212121
//        121212

public class Number_Pattern1 {
    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=6;j++){
//                System.out.print(((i+j)%2)+1);
//            }
//            System.out.println();
//        }
//        Another way
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
}
