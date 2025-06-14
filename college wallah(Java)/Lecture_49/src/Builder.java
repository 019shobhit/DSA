public class Builder {
//    static void rev(StringBuilder s){
//        int i = 0,j=s.length()-1;
//        while(i<j){
//            char x = s.charAt(i);
//            s.setCharAt(i,s.charAt(j));
//            s.setCharAt(j,x);
//            i++;
//            j--;
//        }
//    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
//        str.append("World");
//        str.setCharAt(0,'d' );
//        str.insert(1,"sho");

//        rev(str);
//        str.reverse();

        str.delete(0,4);
        System.out.println(str);
    }
}
