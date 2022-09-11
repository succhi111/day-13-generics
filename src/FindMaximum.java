public class FindMaximum
{
    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum Float Problem using Generics");
        Float a= 29.89f, b = 9.99f, c = 9.96f;  //takiing variables float no.

        testMaximum(a, b, c);  //calling method
    }
    //creating testMaximum method and passing parameters.
    private static void testMaximum(Float a, Float b, Float c) {
        Float max = a; //checking condition and find max float no
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum Number is: " + max); //print maximum float no.

    }
}