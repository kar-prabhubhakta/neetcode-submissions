class Solution {
    public boolean isValid(String s) {
      Stack<Character> validCharacters = new Stack<>();
      char[] chs = s.toCharArray();

        for (char ch : chs) {

            if (ch == '(' || ch == '{' || ch == '[') {

                validCharacters.push(ch);

            } else if (ch == ')') {

                if (validCharacters.isEmpty() || validCharacters.peek() != '(') {
                    return false;
                }

                validCharacters.pop();
                
            } else if (ch == '}') {
                if (validCharacters.isEmpty() || validCharacters.peek() != '{') {
                    return false;
                }
                validCharacters.pop();
            } else if (ch == ']') {
                if (validCharacters.isEmpty() || validCharacters.peek() != '[') {
                    return false;
                }
                validCharacters.pop();
            }
        }
        return validCharacters.isEmpty();

    }
}
