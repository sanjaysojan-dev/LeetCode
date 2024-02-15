package leetCodeQV2;

public class LengthOfLastWord {

    public static int lastWord (String s) {
        String [] words = s.split(" ");
        return words[words.length -1].length();
    }
    public static void main (String args []) {
        System.out.println(lastWord("   fly me   to   the moon  "));
    }
}
