package Lecture_08;

public class ques{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        // System.out.println(sum(arr));
        // System.out.println(mul(arr));
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();

        swap(arr);

        for(int i : arr){
            System.out.print(i+" ");
        }

    }
    static int sum(int[] arr){
        int sum=0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }
    static int mul(int[] arr){
        int mul=1;
        for(int i : arr){
            mul*=i;
        }
        return mul;
    }
    static void swap(int[] arr){
        int maxi = 0;
        int mini = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[maxi] < arr[i]){
                maxi =i;
            }
            if(arr[mini] > arr[i]){
                mini = i;
            }
        }
        int temp = arr[maxi];
        arr[maxi] = arr[mini];
        arr[mini] = temp;
    }
}
