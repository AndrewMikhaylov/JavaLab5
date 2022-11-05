import java.util.ArrayList;

public class Task {
    private ArrayList<String[]> words;
    private ArrayList<Character> characters;
    private ArrayList<String> punctuation;
    private String fulltext;
    Task(ArrayList<String[]> words, ArrayList<Character> characters, ArrayList<String> punctuation, String fulltext){
        this.words = words;
        this.characters = characters;
        this.punctuation = punctuation;
        this.fulltext = fulltext;
    }
    ArrayList<String> newwords = new ArrayList<>();
    public void deletechars() {
        for (String[] string : words) {
            for (String fullword : string) {
                StringBuffer sbr = new StringBuffer(String.valueOf(fullword));
                sbr.reverse();
                for (int i = 1; i < sbr.length(); i++) {
                    if (sbr.charAt(i) == sbr.charAt(0)) {
                        sbr.deleteCharAt(i);
                    }
                }
                sbr.deleteCharAt(0);
                sbr.reverse();
                newwords.add(String.valueOf(sbr));
                newwords.add(" ");
            }
        }
        newwords.add(punctuation.get(punctuation.size()-1));
    }

    public ArrayList<String> getNewtext() {
        return newwords;
    }
}
