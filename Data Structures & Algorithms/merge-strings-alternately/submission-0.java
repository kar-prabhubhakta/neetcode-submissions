class Solution {
    public String mergeAlternately(String word1, String word2) {
        int first = 0;
        int second = 0;
        int firstLength = word1.length();
        int secondLength = word2.length();
        StringBuilder stringBuilder = new StringBuilder();
        while(first < firstLength && second < secondLength){
           stringBuilder.append(word1.charAt(first));
           stringBuilder.append(word2.charAt(second));
           first++;
           second++;
        }

        while (first < firstLength){
            stringBuilder.append(word1.charAt(first));
            first++;
        }

        while (second < secondLength){
            stringBuilder.append(word2.charAt(second));
            second++;
        }

        return stringBuilder.toString();
    }
}