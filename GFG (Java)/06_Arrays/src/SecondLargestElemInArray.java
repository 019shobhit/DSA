public class SecondLargestElemInArray {
    public static void main(String[] args) {
        int arr[] = {2,6,99,56,34,67,23,99};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i: arr){
            if(max < i){
                secondMax = max;
                max = i;
            }
            else if(secondMax < i && i!=max){
                secondMax =i;
            }
        }
        System.out.println("largest element is: "+max);
        System.out.println("Second largest element is: "+secondMax);
    }
}