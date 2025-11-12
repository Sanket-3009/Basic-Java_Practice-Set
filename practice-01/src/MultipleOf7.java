public class MultipleOf7 {
    //Find the First Multiple of 7 Write a program that uses a for loop to iterate from 1 to 100. Find and print the first number that is divisible by both 7 and 9, and then immediately exit the loop.

    public static void main(String[] args) {

        for (int i=1;i<=100;i++){

            if (i%7==0 && i%9==0){
                System.out.println(i);
                break;
            }
        }
    }
}
