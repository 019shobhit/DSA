public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = -1;
            for(int j=i+1;j<n;j++){
                if(arr[j]> arr[i]){
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        for(int i : arr){
            System.out.print(i +" ");
        }
        System.out.println();
        for(int i : ans){
            System.out.print(i +" ");
        }
    }
}
