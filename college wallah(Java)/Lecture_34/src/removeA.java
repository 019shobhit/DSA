import java.util.Scanner;

public class removeA {
    static String remove(String s,int n){
        // recursive function
        if(s.length()==n) return "";
        String ans = remove(s,n+1);
        char c = s.charAt(n);
        if(c=='a'){
            return ans;
        }

        else
            return c+ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.nextLine();
        System.out.println(remove(s,0));
    }
}
