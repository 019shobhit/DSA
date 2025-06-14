public class Fraction {

    int num;
    int den;
    public Fraction(int num,int den){
        this.num=num;
        this.den=den;
    }
    static void printFraction(Fraction f){
        System.out.println(f.num+"/"+f.den+" = ");
    }
    static void simplify(Fraction f){
        int HCF = gcd(f);
        f.num /=HCF;
        f.den /=HCF;
        System.out.println(f.num+"/"+f.den);
    }
    static int gcd(Fraction f){
        int min = Math.min(f.den,f.num);
        for(int i=min;i>0;i--){
            if(f.num%i==0 && f.den%i==0) return i;
        }
        return  1;
    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(20,220);
        Fraction f2 = new Fraction(2,99998);
        printFraction(f1);
//        simplify(f1);
        printFraction(f2);
//        simplify(f2);

    }
}
