
import java.util.Arrays;
import java.util.Scanner;
public class Questions {

    static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
        return new int[]{arr[0],arr[arr.length-1]};
    }

    static boolean isSorted(int[]arr){
        boolean check = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) {
                check =  false;
                break;
            }
        }
        return check;
    }

    static int lastOccurence(int[]arr,int x){
        int lastIndex =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                lastIndex=i;
        }
        return lastIndex;
    }

    static int countOccurence(int[] arr,int x){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter Size of an Array");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elemrnts of an array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

//        int x;
//        System.out.println("Enter element to be searched in array and count");
//        x = sc.nextInt();

//        System.out.println("The Occurence of "+x+" is: "+countOccurence(arr,x));
//        System.out.println("The last occurence of "+x+" is: "+lastOccurence(arr,x));
//        System.out.println("The Array is sorted: "+isSorted(arr));
        int arrr[] = smallestAndLargestElement(arr);
        System.out.println("Smallest Element is: "+arrr[0]);
        System.out.println("Largest Element is: "+arrr[1]);
    }

}
