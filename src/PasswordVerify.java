public class PasswordVerify {
    public boolean hasGoodLength(String password) {
        if(password.length() >= 12){
            return true;
        } else {
            return false;
        }
    }
    public boolean hasNoWhiteSpaces(String password) {
        if(password.contains(" ")){
            return false;
        } else {
            return true;
        }
    }

    public boolean hasNoRepetitions(String password) {
        return true;
    }

    public boolean hasNumbers(String password) {
        return password.matches("[0-9]");
    }

    public boolean hasSpecialCharacter(String password){
        return password.matches("[$&+,:;=?@#|'<>.^*()%!-]");
    }
}
