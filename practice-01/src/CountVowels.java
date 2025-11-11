public class CountVowels {
    //Count Vowels Write a method countVowels(String str) that takes a string and returns the total number of vowels (a, e, i, o, u) it contains.

    public static void main(String[] args) {
        String str= "aeiojjjjU";
        int count=0;
        String str2 = str.toLowerCase();

        for (int i=0;i<str2.length();i++){
            char t= str2.charAt(i);

            switch (t){
                case 'a':
                    count++;
                    break;

                case 'e':
                    count++;
                    break;

                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;


            }


        }
        System.out.println("No of vowels is : "+count);


    }
}
