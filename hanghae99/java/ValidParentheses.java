package hanghae99.java;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length(); i++) {
            sb.append(s.charAt(i));
            if(sb.length() > 1) {
                String lt = sb.substring(sb.length()-2);
                if (lt.equals("()") || lt.equals("{}") || lt.equals("[]")) {
                    sb.delete(sb.length()-2, sb.length());
                }
            }
        }
        return sb.isEmpty();
    }

    public boolean isValid2(String s) {
        HashMap<Character,Character> hm = new HashMap<>();
        Stack<Character> st = new Stack<>();
        hm.put('(', ')');
        hm.put('{', '}');
        hm.put('[', ']');

        for(char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            if (c == ')' || c == '}' || c == ']') {
                if (st.isEmpty() || !hm.get(st.pop()).equals(c)) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}

