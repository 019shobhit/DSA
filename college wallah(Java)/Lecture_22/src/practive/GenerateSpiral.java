package practive;

import java.util.Scanner;

public class GenerateSpiral extends SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n =sc.nextInt();
        int[][] arr= genSpiral(n);
        printMatrix(arr);
    }
    public static int[][] genSpiral(int n){
        int[][] ans= new int[n][n];
        int tr=0;
        int br=n-1;
        int lc=0;
        int rc=n-1;
        int count =1;

        while(count <= n*n ){
            for(int i=lc;i<=rc;i++){
                ans[tr][i]= count++;
            }
            tr++;

            for(int i=tr;i<=br;i++){
                ans[i][rc]=count++;
            }
            rc--;

            for(int i=rc;i>=lc;i--){
                ans[br][i]=count++;
            }
            br--;

            for(int i=br;i>=tr;i--){
                ans[i][lc]= count++;
            }
            lc++;
        }
        return  ans;
    }
}
