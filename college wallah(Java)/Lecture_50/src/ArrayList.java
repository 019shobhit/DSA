import java.util.Arrays;

public class ArrayList {
    public static class Arraylist{
        int[] arr = new int[2];
        int size =0;
        public void add(int n){
            if(size == arr.length){
                arr = Arrays.copyOf(arr,size*2);
            }
            arr[size++]=n;
        }
    }
    public static void main(String[] args) {
        Arraylist arr = new Arraylist();
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        System.out.println(arr.size);
    }
}
