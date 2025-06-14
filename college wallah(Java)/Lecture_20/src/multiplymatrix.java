import java.util.Scanner;

public class multiplymatrix {

    static Scanner sc = new Scanner(System.in);

    static void outputMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] inputMatrix(){
        System.out.println("Enter sixe of Matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter Elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return  arr;
    }

    static void multiMatrix(int[][] arr1,int r1,int c1,int[][] arr2,int r2,int c2){
        if(c1!=r2){
            System.out.println("Multiplication is not possible due to wrong Dimentions");
            return;
        }
        int[][] mul = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){

                for(int k=0;k<c1;k++){
                    mul[i][j]+= arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("The multiplication is: ");
        outputMatrix(mul);

    }


    public static void main(String[] args) {
        int[][] arr1 = inputMatrix();
        int[][] arr2 = inputMatrix();

        multiMatrix(arr1,arr1.length,arr1[0].length,arr2,arr2.length,arr2[0].length);



    }
}
