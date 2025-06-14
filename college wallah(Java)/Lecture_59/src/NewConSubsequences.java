import java.util.Stack;

public class NewConSubsequences {
    static int[] remove(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()== 0 || st.peek() != arr[i]){
                st.push(arr[i]);
            }
            else if(i == n-1 || arr[i] != arr[i+1]){
                st.pop();
            }
        }
        n = st.size();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,5,10,10,10,6,9,3,3,3,4,5,5};
        int[] ans = remove(arr);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
