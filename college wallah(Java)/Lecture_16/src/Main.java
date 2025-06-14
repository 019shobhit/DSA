public class Main{
    public static void main(String[] args) {
        int[] arr = {1,4,7,8,5,2};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max1 <arr[i]) max1=arr[i];
//            if(max2<arr[i] && max1!=arr[i]) max2 = arr[i];
        }for(int i=0;i<arr.length;i++){
//            if(max1 <arr[i]) max1=arr[i];
            if(max2<arr[i] && max1!=arr[i]) max2 = arr[i];
        }
        System.out.println(max1);
        System.out.println(max2);

    }
}