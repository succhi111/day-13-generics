public class FindMaximum <T extends Comparable>
{
    T var1, var2, var3;
    //create constructor
    // If we want to initialize fields of the class with our own values,
    // then use a parameterized constructor.

    public FindMaximum(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");

        // taking variables for integer float string
        Integer a = 99, b = 94, c = 89;
        Float p = 89.29f, q = 9.99f, r = 90.94f;
        String e = "Apple", f = "Orange", g = "Mango";


        new FindMaximum <>(a, b, c).max();
        new FindMaximum<>(p, q, r).max();
        new FindMaximum <>(e, f, g).max();
    }

    // create max method
    private void max() {
        FindMaximum .getMaximum(var1, var2, var3);

    }
    //create generic method the Generic Type extends Comparable
    private static <T extends Comparable> void getMaximum(T a, T b, T c) {

        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum ::" + max);  //print maximum no and string

    }
}