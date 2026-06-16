public class Main{
    public static void main(String[] args) {
        TOH(4,'A','C','B');
    }

    private static void TOH(int n, char source, char helper, char destination) {
//        take n-1 disk disk from source to helper using destionation
        if(n==0) return ;
        TOH(n-1,source,destination,helper);
//        take largest from source to desitination
        System.out.println(source +" -> "+ destination);
        TOH(n-1,helper,source,destination);

    }
}