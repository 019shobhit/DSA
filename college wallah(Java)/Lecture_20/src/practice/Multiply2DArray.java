package practice;

import java.util.Scanner;

public class Multiply2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of of 2d matrix1");
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int[][] arr1 = new int[n1][m1];
        System.out.println("Enter matrix one element");
        for(int i=0;i<n1;i++){
            for(int j =0;j<m1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter size of of 2d matrix 2");
        int n2=sc.nextInt();
        int m2=sc.nextInt();
        int[][] arr2 = new int[n2][m2];
        System.out.println("Enter matrix one element");
        for(int i=0;i<n2;i++){
            for(int j =0;j<m2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        if(m1!=n2) {
            System.out.println("Matrix cant be multiply due to in proper size");
        }
        else{
            int[][] arr= mul(n1,m1,arr1,n2,m2,arr2);
            print(arr);
        }
    }
    public static int[][] mul(int r1,int c1,int[][] arr1,int r2,int c2,int[][] arr2){
        int[][] ans = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k =0;k<c1;k++){
                    ans[i][j] +=arr1[i][k] * arr2[k][j];
                }
            }
        }

        return ans;
    }
    public static void print(int[][] arr){
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
