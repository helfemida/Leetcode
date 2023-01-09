public class MergeAlternately {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqr";
        System.out.println(mergeAlternately(s1, s2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int counter = 0;
        String res = "";
        String reminder = "";
        if (word1.length() > word2.length()) {
            counter = word2.length() * 2;
            reminder = word1.substring(word2.length());
        }
        else if(word1.length()<word2.length()){
            counter = word1.length()*2;
            reminder = word2.substring(word1.length());
        }
        else{
            counter = word1.length()*2;
        }
        int w1 = 0;
        int w2 = 0;
        for (int i = 0; i < counter; i++) {
            if(i%2==0){
                res+=word1.charAt(w1);
                w1++;
            }
            else{
                res+=word2.charAt(w2);
                w2++;
            }
        }
        return res+reminder;
    }
}