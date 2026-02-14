public class Typepromotion {
    public static void main(String args[]){
        char a  = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        /*
         * if the data types are byte,short or char 
         * it will be converted in int type
         * 
         * if the data types are even big then they change according to the data 
         * like if float then float if long then long if double then double
         * 
         * 
         */
        byte c = 5;
        // byte d = c * 2;
        byte d = (byte) (c*2);
        System.out.println(d);

    }
}
