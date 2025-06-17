package Lecture_08;
public class first {
    public static void main(String[] args) {
        int arr[] = { 11, 32, 3, 44, 55 };
        int min = arr[0];
        for (int i : arr) {
            min = Math.min(min,i);
        }
        System.out.println(min);
    }
}
