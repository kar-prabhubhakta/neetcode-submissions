class Solution {
    public int calPoints(String[] operations) {
         Stack<Integer> res = new Stack<>();
        for (String str : operations) {
            switch (str) {
                case "+":

                    res.push(res.get(res.size() - 1) + res.get(res.size() - 2));
                    break;
                case "C":

                    res.pop();
                    break;
                case "D":

                    res.push(res.peek() * 2);
                    break;
                default:

                    res.push(Integer.parseInt(str));
            }

        }
        int total = 0;
        for (int score : res) {
            total += score;
        }
        return total;
    }
}