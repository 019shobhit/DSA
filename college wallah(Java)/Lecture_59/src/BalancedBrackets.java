import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '('){
                st.push(c);
            }
            else {
                if(st.size()==0) return false;
                if(st.peek() == '(') st.pop();
            }
        }
        if (st.size() > 0) return false;
        return true;
    }
    public static int stepsToBalance(String str){
        Stack<Character> st = new Stack<>();
        int count=0;
        for(char c : str.toCharArray()){
            if(c == '('){
                st.push(c);
            }
            else {
                if(st.size()==0) {
                    count++;
                }
                else if(st.peek() == '('){
                    st.pop();
                }
            }
        }
        count +=st.size();
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.println(stepsToBalance(str));
    }
}
