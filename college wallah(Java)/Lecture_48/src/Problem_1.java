// You have 'n'(n<=10^5) boxes of chocolate. Each of contains a[i] (a[i]<=10000) chocolate. you need to distribute these boxes among 'm' students such that the maximum number of chocolate allocated to a student is minimum.
// (a) One box will be allocated to exactly one student.
// (b) All the boxes should be allocated.
// (c) Each student has to be allocated at least one box.
// (d) Allotment should be in contiguous order, for instance, a student cannot be allocated box 1 and box 3,skipping box 2.
//
// Calculate and return that minimum possible number.
//
// Assume that it is always possible to distribute the chocolates.
//
// The first line of input will contain the value of n, the number of boxes.
// The second line of input will contain the n number denoting the number of chocolate in each box.
// The third line will contain the m, number of students.

public class Problem_1 {

    static boolean isDivisionPossible(int[] a,int m,int maxChocolate){
        int numberOfStudents = 1;
        for(int i=0;i<a.length;i++){

        }
    }

    static int distributeChocolate(int[] arr, int m){
        int ans = 0, st =1, end = (int)1e9;
        while(st<=end){
            int mid= st+(end-st)/2;
            if(isDivisionPossible(arr,m,mid)){

            }
            else{

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2};
        int student = 3;
        System.out.println(distributeChocolate(arr,student));
    }
}
