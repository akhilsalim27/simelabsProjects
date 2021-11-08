public class Main {

    public static void main(String[] args) {

        MyChar myChar = new MyChar('8');

        System.out.println(myChar.isVowel());
        System.out.println(myChar.isConsonant());
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());

    }
}
