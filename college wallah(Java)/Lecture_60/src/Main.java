import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(char c : str.toCharArray()){
            int ascii = (int)c;
            if(ascii >= 48 && ascii <=57){
               st.push(ascii - 48);
            }
            else if(op.size() ==0 || c=='(' || op.peek() == '(') op.push(c);
            else{

            }

        }


    }
}