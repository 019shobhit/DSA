public class KeypadCombination {

    static void combination(String dig,String[] kp,String res){
        if(dig.isEmpty()){
            System.out.print(res+" ");
            return;
        }
        int currNum = dig.charAt(0)-'0';
        String currChoice = kp[currNum];
        for(int i=0;i<currChoice.length();i++){
            combination(dig.substring(1),kp,res+currChoice.charAt(i));
        }
        
    }

    public static void main(String[] args) {
        String str ="2539";
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(str,kp,"");
    }
}
