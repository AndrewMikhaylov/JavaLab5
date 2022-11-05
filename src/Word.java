import java.util.ArrayList;

public class Word {
    private String[] words;
    private String str;
    Word(String str){
        this.str = str;
    }
    ArrayList<String[]> wordlist = new ArrayList<>();
    public void SplitStr(){
        words = str.split("[, . ? !]+");
        wordlist.add(words);
        }

    public ArrayList<String[]> Getwords(){
        return wordlist;
    }

}
