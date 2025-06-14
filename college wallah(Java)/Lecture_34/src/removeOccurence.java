import java.util.Scanner;

public class removeOccurence {
    static String remove(String s){
      if(s.length()== 0) return "";
      String str = remove(s.substring(1));
      char c = s.charAt(0);
      if(c == 'a')return str;
      return c+str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = sc.nextLine();
        System.out.println(remove(s));
    }
}
