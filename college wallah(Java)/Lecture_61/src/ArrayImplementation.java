public class ArrayImplementation {
    public static class QueueArray{
        int f =-1;
        int r = -1;
        int[] arr = new int[100];

        void add(int x){
            if(r==arr.length){
                System.out.println("Queue is full");
                return;
            }
            if(r==-1){
                f=0;
                r=0;
                arr[r]=x;
            }
            else {
                arr[++r]=x;
            }
        }
        int remove(){
            if(size() ==0){
                System.out.println("Queue is Empty!");
                return  -1;
            }
            return arr[f++];
        }
        int peek(){
            if(size() ==0){
                System.out.println("Queue is Empty!");
                return  -1;
            }
            return arr[f];
        }
        int size(){
            return r-f+1;
        }
        void display(){
            if(size() ==0){
                System.out.println("Queue is Empty!");
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.display();
    }
}
