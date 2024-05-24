package hanghae99.java;

import java.util.Stack;

class CorrectBracket {
    boolean solution(String s) {
        int count = 0;
        for (int i=0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            }

            if(s.charAt(i) == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}

class CorrectBracket2 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(') stack.push(s.charAt(i));
            if(s.charAt(i) == ')') {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}