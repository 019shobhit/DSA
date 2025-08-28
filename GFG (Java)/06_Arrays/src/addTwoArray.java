import java.util.ArrayList;

public class addTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 2, 7};
        int[] arr2 = {9, 2, 1};
        int n = Math.max(arr1.length, arr2.length);
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i >= 0 && j >= 0) {
            int sum = arr1[i--] + arr2[j--] + carry;
            carry = sum / 10;
            sum = sum % 10;
            list.add(0,sum);
        }
        while(i>=0){
            int sum = arr1[i--] + carry;
            carry = sum / 10;
            sum = sum % 10;
            list.add(0,sum);
        }
        while(j>=0){
            int sum = arr2[j--] + carry;
            carry = sum / 10;
            sum = sum % 10;
            list.add(0,sum);
        }
        if (carry != 0) {
            list.add(0,carry);
        }
        System.out.println(list);
    }
}
