public class FindMaximum
{
    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum Integers Problem using Generics");
        Integer a = 89, b =99, c = 29;//variables
        testMaximum (a,b,c);//calling method
    }
    private static void testMaximum(Integer a,Integer b, Integer c){
        Integer max =a;//checking the condition and
        if(b.compareTo(a)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max =c;
        }
        System.out.println("maximum number is "+max);
    }
}
