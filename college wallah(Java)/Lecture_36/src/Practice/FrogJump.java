package Practice;

public class FrogJump {
    public static int cost(int[] h, int idx){
        if(idx==h.length-1) return 0;
        int op1 =Math.abs(h[idx]-h[idx+1]) + cost(h,idx+1);
        if(idx== h.length-2) return op1;
        int op2 =Math.abs(h[idx]-h[idx+2]) + cost(h,idx+2);
        return  Math.min(op1,op2);
    }
    public static void main(String[] args) {
        int[] heights = {30,20,50,40,60};
        System.out.println(cost(heights,0));
    }
}
