import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        String text = "Я люблю кіткат, Java.";
        System.out.println(text);
        Word words = new Word(text);
        words.SplitStr();
        ArrayList<String[]> words1 = words.Getwords();
        for (String[] string: words1) {
            System.out.println(Arrays.toString(string));
        }
        Char characters = new Char(words1);
        characters.divide();
        ArrayList<Character> characters1 = characters.getLetters();
        for (Character string: characters1) {
            System.out.print(string);
        }
        Punctuation punctuations = new Punctuation(characters1, text);
        punctuations.SplitStr();
        ArrayList<String> punctuations1 = punctuations.getSymbol();
        for (String string: punctuations1) {
            System.out.println(string);
        }
        Task fulltext = new Task(words1, characters1, punctuations1, text);
        fulltext.deletechars();
        ArrayList<String> fulltext1 = fulltext.getNewtext();
        for (String string:fulltext1) {
            System.out.print(string);
        }

    }
}


