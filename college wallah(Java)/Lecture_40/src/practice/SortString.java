package practice;

public class SortString {
    static void print(String[] arr){
        for(String i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void sort(String[] str){
        for(int i=0;i<str.length-1;i++){
            int min_idx=i;
            for(int j=i+1;j<str.length;j++){
                if(str[j].compareTo(str[min_idx]) <0){
                    min_idx=j;
                }
            }
            if(min_idx != i){
                String temp = str[i];
                str[i] =str[min_idx];
                str[min_idx]=temp;
            }
        }
    }
    public static void main(String[] args) {
        String[] str={"papaya","lime","watermelon","apple","mango","kiwi"};
        print(str);
        sort(str);
        print(str);

    }
}
