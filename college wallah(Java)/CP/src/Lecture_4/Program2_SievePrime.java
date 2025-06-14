package Lecture_4;

import java.util.Arrays;
import java.util.Scanner;

public class Program2_SievePrime {
    public static boolean[] sieve(int n ){
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<n;i++){
            if(arr[i]){
                for(int j=i+i;j<=n;j+=i){
                    arr[j] = false;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = sieve(n);
        int count=0;
        for(boolean i : arr){
            if(i) count++;
        }
        System.out.println(count);
    }
}
