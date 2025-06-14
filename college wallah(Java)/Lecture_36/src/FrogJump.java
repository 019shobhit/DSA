public class FrogJump {

    static int frogJump(int[] arr,int n ,int idx){
        if(idx == n-1) return 0;
        int op1 =Math.abs(arr[idx]-arr[idx+1]) + frogJump(arr,n,idx+1);
        if(idx == n-2) return op1;
        int op2 =Math.abs(arr[idx]-arr[idx+2]) + frogJump(arr,n,idx+2);
        return Math.min(op1,op2);
    }

    public static void main(String[] args) {
        int[] arr = {10,30,40,20,40,60,50,10,46,89,56,12,45,79,56};
        int x = frogJump(arr,arr.length,0);
        System.out.println("The minimum jump by the Frog is: "+x);
    }
}
