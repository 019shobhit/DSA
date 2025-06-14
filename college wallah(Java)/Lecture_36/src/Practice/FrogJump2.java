package Practice;

public class FrogJump2 {
    public static int jump(int[] arr,int idx){
        if(idx==arr.length-1) return 0;
        int op1=Math.abs(arr[idx]-arr[idx+1])+jump(arr,idx+1);
        if(idx==arr.length-2) return op1;
        int op2=Math.abs(arr[idx]-arr[idx+2])+jump(arr,idx+2);
        return Math.min(op1,op2);
    }
    public static void main(String[] args) {
        int[] arr ={20,40,35,45,20,30,25};
        System.out.println(jump(arr,0));
    }
}
