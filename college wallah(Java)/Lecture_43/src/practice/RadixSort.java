package practice;

public class RadixSort{
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static int findMax(int[] arr){
        int mx= arr[0];
        for(int i : arr){
            if(mx<i) mx=i;
        }
        return mx;
    }
    public static void countSort(int[] arr,int place){
        int[] ans = new int[arr.length];
        int[] ps = new int[10];
        for(int i : arr){
            ps[(i/place)%10]++;
        }
        for(int i=1;i<ps.length;i++){
            ps[i]+=ps[i-1];
        }
        //.............................
        for(int i=arr.length-1;i>=0;i--){
            int idx = ps[(arr[i]/place%10)]--;
            ans[idx-1]= arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]= ans[i];
        }
    }

    public static void sort(int[] arr){
        int max = findMax(arr);
        for(int i =1;max/i>0;i*=10){
            countSort(arr,i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {123,234,345,765,432,222,9,23};
        print(arr);
        sort(arr);
        print(arr);
    }

}
