import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Punctuation {
    private String wordsandsymbols;
    private ArrayList<Character> text;

    Punctuation(ArrayList<Character> text, String wordsandsymbols) {
        this.text = text;
        this.wordsandsymbols = wordsandsymbols;

    }

    ArrayList<String> symbl = new ArrayList<>();
    ArrayList<Character> symblandword = new ArrayList<Character>();
    public void SplitStr() {
        for (char string : wordsandsymbols.toCharArray()) {
            symblandword.add(string);
        }
        for (Character symbol : symblandword) {
            if (text.contains(symbol)) {
            }
            else{
                symbl.add(String.valueOf(symbol));
            }
        }
        Set<String> set = new HashSet<>(symbl);
        symbl.clear();
        symbl.addAll(set);
    }

    public ArrayList<String> getSymbol() {
        return symbl;
    }
}
