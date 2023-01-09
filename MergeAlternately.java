public class MergeAlternately {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqr";
        System.out.println(mergeAlternately(s1, s2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int counter = Math.min(word1.length(),word2.length());
        String res = "";
        for (int i = 0; i < counter; i++) {
            res+=word1.charAt(i);
            res+=word2.charAt(i);
        }
        if(word1.length()>word2.length()){
            res+=word1.substring(counter);
        }
        else if(word2.length()>word1.length()){
            res+=word2.substring(counter);
        }
        return res;
    }
}