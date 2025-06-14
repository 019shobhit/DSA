public class PrintSSQ {

    static void printSSQ(String str, String currAns){
        if(str.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr = str.charAt(0);
        String remString = str.substring(1);

        printSSQ(remString,currAns+curr);

        printSSQ(remString,currAns);


    }

    public static void main(String[] args) {
        printSSQ("abcd","");
    }
}
