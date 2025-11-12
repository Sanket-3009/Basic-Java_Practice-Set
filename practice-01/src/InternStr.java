public class InternStr {
    //String Pool Manual Check Given these two strings, String s1 = "hello"; and String s2 = new String("hello");, write code that uses the .intern() method to prove that s1 and the interned version of s2 are the same object in the String Pool.

    public static void main(String[] args) {
        String str= "Hello";
        String str2 = new String("Hello");

        if (str==str2){
            System.out.println("Same ref");
        } else if (str == str2.intern()) {
            System.out.println("Same Value after intern");

        }else {
            System.out.println(str.equals(str2));
        }
    }
}
