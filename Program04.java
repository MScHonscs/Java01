import java.util.*;

class DigitNumException extends Exception {

    public DigitNumException(String S) {
        super(S);
    }
}

class NameException extends Exception {

    public NameException(String S) {
        super(S);
    }
}

class SpecialCharacterException extends Exception {

    public SpecialCharacterException(String S) {
        super(S);
    }
}

public class Program04 {

    public static void main(String[] args) throws DigitNumException, NameException, SpecialCharacterException {
        Scanner s = new Scanner(System.in);
        String S;
        System.out.println("ENTER NAME : ");
        S = s.nextLine();

        if (S.length() < 5) {
            throw new NameException("Name contain letters less than 5. ");
        }
        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) {
                throw new DigitNumException("Name has digit. ");
            }
            if (!Character.isAlphabetic(S.charAt(i)) && !Character.isDigit(S.charAt(i))) {
                throw new SpecialCharacterException(" Name contains special character. ");
            }
        }
    }
}
