import java.util.ArrayList;

public class Char {
    private ArrayList<String[]> letters;

    Char(ArrayList<String[]> letters) {
        this.letters = letters;
    }

    ArrayList<Character> letter = new ArrayList<>();

    public void divide() {
        for (String[] string : letters) {
            for (String kl : string) {
                for (char h: kl.toCharArray()) {
                    letter.add(h);
                }
            }
        }
    }
    public ArrayList<Character> getLetters () {
        return letter;
    }
}
