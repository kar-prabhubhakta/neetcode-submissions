class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> myStack = new Stack<>();

        for( String str: tokens){

             if(str.equals("+")){

                int first = myStack.pop();
                int second = myStack.pop();
                myStack.push(first + second);

             }else if(str.equals("*")){

                int first = myStack.pop();
                int second = myStack.pop();
                myStack.push(first * second);

             }else if(str.equals("-")){

                int first = myStack.pop();
                int second = myStack.pop();
                myStack.push(second - first);

             }else if(str.equals("/")){

                int first = myStack.pop();
                int second = myStack.pop();
                myStack.push(second/first);

             }else{

                myStack.push(Integer.parseInt(str));

             }
        }
        return myStack.peek();
    }
}
