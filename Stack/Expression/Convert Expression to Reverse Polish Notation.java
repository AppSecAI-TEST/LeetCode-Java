public class Solution {
    /**
     * @param expression: A string array
     * @return: The Reverse Polish notation of this expression
     */
    public ArrayList<String> convertToRPN(String[] expression) {
        if (expression == null) {
            throw new IllegalArgumentException();
        }
        
        ArrayList<String> result = new ArrayList<String>();
        Stack<String> opr = new Stack<String>();
        String list = "+-*/";
        
        for (String cur : expression) {
            if (cur.equals("(")) {
                opr.push(cur);
            }
            else if (cur.equals(")")) {
                while (!opr.peek().equals("(")) {
                    result.add(opr.pop());
                }
                
                opr.pop();
            }
            else if (list.contains(cur)) {
                while (!opr.empty() && !opr.peek().equals("(") && priority(opr.peek(), cur)) {
                    result.add(opr.pop());
                }
                
                opr.push(cur);
            }
            else {
                result.add(cur);
            }
        }
        
        while (!opr.empty()) {
            result.add(opr.pop());
        }
                
        return result;
    }
    
    private boolean priority(String a, String b) {
        if (a.equals("*") || a.equals("/")) {
            return true;
        }
        else if (b.equals("+") || b.equals("-")) {
            return true;
        }
        else {
            return false;
        }
    }
}
