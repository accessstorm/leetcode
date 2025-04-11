class Solution {
    public int lengthOfLastWord(String s) {
        String array[] = s.split(" "); //split at every space
        String words = array[array.length - 1]; //get the last word
        int lastWord = words.length();
        return lastWord;
    }
}
