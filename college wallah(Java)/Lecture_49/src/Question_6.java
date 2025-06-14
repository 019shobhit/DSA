// The string should be compared such that consecutive duplicates of characters are replaced with character and followed by the number of consecutive duplicates.

public class Question_6 {
    public static void main(String[] args) {
        String  str = "aaabbccccdddeeeffffxxxxxxxxxxxxxxxxxxxxy";

        char pc = str.charAt(0);
        String ans = ""+pc;
        int count = 1;
        for(int i=1;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == pc ) count ++;
            else {
                if(count != 1)
                    ans +=count;
                count =1;
                ans += pc = ch;
            }
        }
        if(count != 1)
            ans +=count;
        System.out.println(ans);
    }
}
