import java.util.Stack;

public class PreviousGreater {
    public static void main(String[] args) {
        int[] arr ={40,80,60,70,60,75,85};
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        st.push(arr[0]);
        ans[0] = -1;
        for(int i=1;i<n;i++){
            while(st.size() != 0 && st.peek() < arr[i]){
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
        for(int i : arr){
            System.out.print(i +" ");
        }
        System.out.println("");
        for(int i : ans){
            System.out.print(i +" ");
        }
    }
}
