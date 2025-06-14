public class SubStr {
    public static void main(String[] args) {

        String str = "Shobhit";
//        str.charAt(1) = 'd';
//        str.substring(0,1) = 'd';
        str = "d"+str.substring(1);
        System.out.println(str);
//        System.out.println(str.substring(0,3));
//        System.out.println(str.substring(3));
    }
}
