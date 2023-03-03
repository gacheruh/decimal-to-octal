public class decimalToOctal {
    public static void main(String[] args){
        System.out.println(decToOctal(49));
        System.out.println(decToOctal(0));
    }

    public static String decToOctal(int n){
        int quot = n;
        String oct = "";
        int rem;
        while(quot != 0){
            rem = quot % 8;
            oct = rem + oct;
            quot = quot / 8;
        }


        return oct;
    }
}
