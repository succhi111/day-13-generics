public class FindMaximum
{
    public static void main(String[] args) {

        //1st print welcome msg.
        System.out.println("Welcome to Generic Program.");

        // variables integer , float , and string
        Integer a = 89, b = 99, c = 94;
        Float p = 89.94f, q = 9.99f, r = 29.89f;
        String e = "Apple", f = "Orange", g = "Mango";

        //calling generic getMethod directly coz in main method and generics method
        // using static keyword so not needed
        //to create object for class.


        FindMaximum.getMaximum(a, b, c);
        FindMaximum.getMaximum(p, q, r);
        FindMaximum.getMaximum(e, f, g);
    }
    //create generic method the Generic Type extends Comparable

    private static <T extends Comparable> void getMaximum(T a, T b, T c) {

        //check the condition and finding max for integer string and float
        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        //print maximum no and string
        System.out.println("Maximum ::" + max);

    }

}