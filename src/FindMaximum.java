public class FindMaximum <T extends Comparable<T>> {
    // create generics maximum Value method and passing parameters

    T val1, val2, val3, val4, val5;
    // create constructor and passing parameter
    public FindMaximum (T val1, T val2, T val3, T val4, T val5) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
        this.val5 = val5;
    }
    // create method is maximumValue
    public T maximumValue() {
        return maximumValue(val1, val2, val3, val4, val5);  //return value
    }
    // creating generic method and passing parameter
    public static <T extends Comparable<T>> T maximumValue(T val1, T val2, T val3, T val4, T val5) {

        T max = val1;

        // checking condition and finding max no
        if (val2.compareTo(max) > 0) {
            max = val2;
        }
        if (val3.compareTo(max) > 0) {
            max = val3;
        }
        if (val4.compareTo(max) > 0) {
            max = val4;
        }
        if (val5.compareTo(max) > 0) {
            max = val5;

        }
        printMax(val1, val2, val3,val4,val5, max);
        return max;
    }

    // create method printMax and passing parameter
    private static <T> void printMax(T val1, T val2, T val3, T val4, T val5, T max) {

        //print the max value
        System.out.println("the maximum of" + val1 + "," + val2 + "," + val3 + "," + val4 + " & " + val5 + " is : " + max);
    }

    public static void main(String[] args) {
        System.out.println("   welcome to generics code  ");
        maximumValue(1,2,3,4,5);
        maximumValue(9.94f , 9.96f , 29.9f , 9.99f , 29.89f);
        new FindMaximum<>(2,3,4,5,6).maximumValue();

    }
}