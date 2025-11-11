public class PalindromeString {
    /*
    Palindrome Checker Write a Java method isPalindrome(String str) that returns true if the given string is a palindrome (reads the same forwards and backward) and false otherwise. The check should be case-insensitive and ignore spaces.

     */
    public static void main(String[] args) {
        if ( isPalindrome(" J ixj ")){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
    public static boolean isPalindrome(String str){
        boolean check = false;
        String temp="";
        for (int i=str.length()-1;i>=0;i--){
             temp += str.charAt(i);
        }

        if ((temp.replaceAll("\\s+","")).equalsIgnoreCase(str.replaceAll("\\s+",""))){
            check= true;
        }
        return check;
    }
}
