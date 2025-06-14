package Practice;

public class KeyPadCombination {
    static void combination(String dig,String[] kp,String ans){
        if(dig.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }
        int num =dig.charAt(0)-'0';
        String str=kp[num];
        for(int i=0;i<str.length();i++){
            combination(dig.substring(1),kp,ans+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String dig = "23456";
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig,kp,"");
    }
}
