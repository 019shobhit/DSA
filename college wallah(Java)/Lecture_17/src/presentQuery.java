import java.util.Scanner;
public class presentQuery {
    static int[] makeFrequenceyArray(int[] arr){
        int[] frq = new int[100005];

        for (int j : arr) {
            frq[j]++;
        }
        return frq;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" elements of array");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] freq =makeFrequenceyArray(arr);
        System.out.println("Enter Number of Queries: ");
        int q = sc.nextInt();

        while(q>0){
            System.out.println("Enter Element to be searched in the Array: ");
            int x= sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes-- The element you searched is present in the array");
            }
            else {
                System.out.println("NO-- The Element you searched is Not present in the array");
            }
            q--;
        }
    }
}
