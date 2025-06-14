public class CircularQueueArray {
    public static class CQueue {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) throws Exception {
            if ((r + 1) % arr.length == f) {
                throw new Exception("Queue is full");
            }
            if (size == 0) {
                f = r = 0;
            } else {
                r = (r + 1) % arr.length;
            }
            arr[r] = val;
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty");
            }
            int temp = arr[f];
            if (f == r) {
                f = r = -1;
            } else {
                f = (f + 1) % arr.length;
            }
            size--;
            return temp;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            int i = f;
            do {
                System.out.print(arr[i] + " ");
                i = (i + 1) % arr.length;
            } while (i != (r + 1) % arr.length);
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        CQueue q = new CQueue();
        q.add(12);
        q.add(13);
        q.add(14);
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.remove());
        q.display();
    }
}
