package practice;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(arr);
        System.out.println("Transpose matrix");
//        int[][] ans = transpose(arr);
//        print(ans);
        transposeinPlace(arr);
        print(arr);


    }
    static void transposeinPlace(int[][] arr){
        int r = arr.length;
        int c= arr[0].length;
        for(int i=0;i<c;i++){
            for(int j =0;j<i;j++){
                    swap(arr,i,j);
            }
        }
    }
    static void swap(int[][] arr,int i,int j){
        int temp = arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
    static int[][] transpose(int[][] arr){
        int r = arr.length;
        int c= arr[0].length;
        int[][] ans = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j =0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    static void print(int[][] arr){
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
