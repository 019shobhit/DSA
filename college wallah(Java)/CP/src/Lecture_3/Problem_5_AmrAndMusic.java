package Lecture_3;

import java.util.*;

public class Problem_5_AmrAndMusic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            list.add(new int[] {temp,i+1});
        }
        list.sort(Comparator.comparingInt(a -> a[0]));
        List<Integer> ans = new ArrayList<>();
        int sum =0;
        for(int[] i : list){
            if(i[0]+sum <= d){
                sum+=i[0];
                ans.add(i[1]);
            }
            else{
                break;
            }
        }
        System.out.println(ans.size());
        for(int i : ans){
            System.out.print(i+ " ");
        }
    }
}
