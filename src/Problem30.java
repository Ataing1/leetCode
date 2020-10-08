import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem30 {
    /**
     *
     */
    public Problem30() {
        System.out.println("problem30: ");
    }

    //very slow and memory intensive, but it was my first attempt
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> ret = new ArrayList<>();
        int wordWidth = words[0].length();
        for (int i = 0; i < s.length() + 1 -words.length* words[0].length(); i++) {
            String subString = s.substring(i, i + wordWidth * words.length);
            List<String> tokens = new ArrayList<>();
            for (int start = 0; start < subString.length(); start += wordWidth) {
                tokens.add(subString.substring(start, Math.min(subString.length(), start + wordWidth)));
            }
           //print(tokens);

            for (String word : words) {
                tokens.remove(word);
                //print(tokens);
            }
            System.out.println(" " + tokens.size());
            if (tokens.size() <= 0) {
                ret.add(i);
            }

        }
        return ret;

    }

    //for debugging
    public void print(List<String> print){
        for(String s: print){
            System.out.print(s);
        }
        System.out.print(" ");
    }




}