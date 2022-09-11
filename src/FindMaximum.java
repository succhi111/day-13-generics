public class FindMaximum <T extends Comparable> {
    // create genterics maxmumValue method and passing parameters

    public static <T extends Comparable<T>> T maximumValue(T val1, T val2, T val3, T val4, T val5) {

        T max = val1;
        //checking conditions
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
        return max;
    }

    public static void main(String[] args) {

        FindMaximum max = new FindMaximum(); // creating object for FindMaximum class object name is max

        //print maximum value
        System.out.println("The maximum value is : " + maximumValue(29.89f, 9.99f, 9.96f, 15.94f, 8.25f));


    }
}