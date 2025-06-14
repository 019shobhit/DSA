package practice;

import java.util.ArrayList;

public class ReturnAllIndexes {
    public static void print(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static ArrayList<Integer> find(int[] arr,int idx, int t){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx >=arr.length) return list;
        if(arr[idx] == t) list.add(idx);
        ArrayList<Integer> ans = find(arr,idx+1,t);
        list.addAll(ans);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,1,2,1,2,1,2,1,2};
//        int[] arr = {1,2,3,1,2,2,4,5};
        ArrayList<Integer> list = find(arr,0,2);
        System.out.println(list);;
    }
}
