public class Main {
    public static void main(String[] args) {

        System.out.println(password("1234"));
        System.out.println(password("abbos50"));
        System.out.println(password("abbos5039"));
        System.out.println(password(""));

    }
    public static String password(String pass){

        if (pass.isEmpty()){
            return "empty";
        }

        int length = pass.length();
        if (length >= 1 && length <= 5){
            return "weak";
        } else if (length >= 6 && length <= 8){
            return "normal";
        } else {
            return "strong";
        }

    }
}