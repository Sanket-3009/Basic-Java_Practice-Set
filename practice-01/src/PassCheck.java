public class PassCheck {
    //First "Safe" Password Checker Write a method isValidPassword(String password) that checks if a password is valid. A valid password must:
    //
    //Be at least 8 characters long (.length()).
    //
    //Contain at least one number (you'll need a loop for this).
    //
    //Not contain any spaces (.contains()).

    public static void main(String[] args) {
        String pass = "Sanket09";

        if (pass.length() >= 8){
            boolean hasDigit=false;
            boolean noSpaces = false;
            for (int i=0; i<pass.length()-1;i++){
                char t = pass.charAt(i);
                if (Character.isDigit(t)){
                    hasDigit = true;
                }
            }
            if (pass.contains("")){
                noSpaces = true;

            }
            if (hasDigit && noSpaces){
                System.out.println("It's a valid pass");
            }else {
                System.out.println("Not valid pass");
            }

        }else {
            System.out.println("Less then 8 digits pass");
        }
    }
}
