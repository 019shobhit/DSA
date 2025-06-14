package Practice;

public class Question1 {
    static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,7,4,5,6,3,8};
        print(arr);
        int x=-1;
        int y=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] <arr[i-1]){
                if(x==-1){
                    x= i-1;
                    y=i;
                }else{
                    y=i;
                }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
        print(arr);
    }
}
