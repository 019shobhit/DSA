import java.util.Stack;

public class NGUSelf {
    public static void main(String[] args) {
        int[] arr = {1,8,2,4,5,6,4,45,49,1,48,6};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size() > 0 && arr[i] >st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                st.push(arr[i]);
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
                st.push(arr[i]);
            }
        }
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
