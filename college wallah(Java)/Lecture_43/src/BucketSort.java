import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BucketSort {

    static void bucketSort(float[] arr){
        // Buckets
        int n = arr.length;
        ArrayList<Float>[] buckets = new ArrayList[n];
        // Create empty Buckets
        for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
        }
        // Add elements in the buckets
        for(int i=0;i<n;i++){
            int idx = (int)(arr[i] * n);
            buckets[idx].add(arr[i]);
        }
        // sort Each Bucket Individually
        for(int  i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }
        // Merge all buckets to get final sorted Array
        int index =0;
        for(int i = 0; i<buckets.length; i++){
            ArrayList<Float> ans = buckets[i];
            for(int j=0;j<ans.size();j++){
                arr[index++]= ans.get(j);
            }
        }
    }

    public static void main(String[] args) {
//        float[] arr = {0.5f,0.23f,0.56f,0.78f,0.89f,0.45f,0.12f,0.199f};
        float[] arr ={0.5f,0.3f,0.2f,0.4f,0.1f};
        bucketSort(arr);
        for (float v : arr) System.out.print(v + " ");
    }
}
