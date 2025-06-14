public class SortString {

    static  void sort(String[] fruits){
        int n = fruits.length;
        for(int i=0;i<n-1;i++){
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if (fruits[j].compareTo(fruits[min_idx]) < 0) {
                    min_idx = j;
                }
            }
            if(min_idx != i){
                String temp = fruits[i];
                fruits[i] = fruits[min_idx];
                fruits[min_idx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"kivi","apple","papaya","mango"};
        sort(fruits);
        for(String val : fruits){
            System.out.print(val +" ");
        }
    }
}
