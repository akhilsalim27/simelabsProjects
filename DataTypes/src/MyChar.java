public class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        if (ch == 'a')
            return true;
        if (ch == 'e')
            return true;
        if (ch == 'i')
            return true;
        if (ch == 'o')
            return true;
        if (ch == 'u')
            return true;
        return false;
    }

    public boolean isDigit() {
        if (ch >= '0' && ch <= '9')
            return true;
        return false;
    }

    public boolean isAlphabet() {
        if (ch >= 'a' && ch <= 'z')
            return true;
        return false;
    }

    public boolean isConsonant() {
        if (isAlphabet() && !isVowel())
            return true;
        return false;
    }
}


