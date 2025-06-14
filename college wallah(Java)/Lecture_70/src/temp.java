public class temp {
    public static void main(String[] args) {
        String s = "aabsbdbfabfbafbabf";
        String ans = "";
        for(char c : s.toCharArray()){
            if(c!='a'){
                ans= ans+c;
            }
        }
        System.out.println(ans);
    }
}
