public class LogicalOperations {
    public static void main(String[] args) {
        int a=15,b=10,c=5;

//        && operator
        System.out.println((a>b) && (a>c));
        System.out.println((a>b) && (a<c));

//        || operator
        System.out.println((a>b) || (a>c));
        System.out.println((a>b) || (a<c));
        System.out.println((a<b) || (a<c));

//        ! operator
        System.out.println(!(a==b));
        System.out.println(!(a>b));
    }
}
