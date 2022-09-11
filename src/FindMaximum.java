public class FindMaximum
{
    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum Float Problem using Generics");
        String e = "Apple", f = "Orange" , g = "Mango";    //take variables strings

        //calling directly without creating object bcoz testMaximum method also static.
        testMaximum (e,f,g);//calling method
    }
    //creating testMaximum method and passing parameter in string type
    private static void testMaximum(String e, String f, String g) {
        String max = e; //checking condition comparing and finding max string
        if(f.compareTo(e)>0){
            max = f;
        }
        if(g.compareTo(max)>0){
            max = g;
        }
        System.out.println("Maximum String is: "+max);//print maximum string

    }


}