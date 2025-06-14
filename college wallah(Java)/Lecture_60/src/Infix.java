import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(char c : str.toCharArray()){
            int ascii = (int) c;
            if(ascii >=48 && ascii<=57) st.push(ascii - 48);
            else if(op.size() == 0 || c == '(' || op.peek() == '(') op.push(c);
            else if(c == ')'){
                while(op.peek() != '('){
                    int a = st.pop();
                    int b = st.pop();
                    if(op.peek() == '-') st.push(b-a);
                    else if(op.peek() == '+') st.push(b+a);
                    else if(op.peek() == '*') st.push(b*a);
                    else if(op.peek() == '/') st.push(b/a);
                    op.pop();
                }
                op.pop();
            }
            else{
                if(c == '+' || c == '-'){
                    int a = st.pop();
                    int b = st.pop();
                    if(op.peek() == '-') st.push(b-a);
                    else if(op.peek() == '+') st.push(b+a);
                    else if(op.peek() == '*') st.push(b*a);
                    else if(op.peek() == '/') st.push(b/a);
                    op.pop();
                    op.push(c);
                }
                if(c == '*' || c =='/'){
                    if(op.peek() == '*' ||op.peek() == '/'){
                        int a = st.pop();
                        int b = st.pop();
                        if(op.peek() == '*') st.push(b*a);
                        else if(op.peek() == '/') st.push(b/a);
                        op.pop();
                        op.push(c);
                    }
                    else op.push(c);
                }
            }
        }
        while(st.size() >1){
            int a = st.pop();
            int b = st.pop();
            if(op.peek() == '-') st.push(b-a);
            else if(op.peek() == '+') st.push(b+a);
            else if(op.peek() == '*') st.push(b*a);
            else if(op.peek() == '/') st.push(b/a);
            op.pop();
        }
        System.out.println(st.peek());
    }
}
