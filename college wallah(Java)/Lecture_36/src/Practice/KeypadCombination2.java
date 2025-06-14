package Practice;

public class KeypadCombination2 {
    static void print(String dig, String[] kp, String ans){
        if(dig.isEmpty()) {
            System.out.println(ans);
            return;
        }
        int num = dig.charAt(0) - '0';
        String str=kp[num];
        for(int i=0;i<str.length();i++){
            print(dig.substring(1),kp,ans+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String dig="22";
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        print(dig,kp,"");
    }
}
