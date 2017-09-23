/**
* 是否是合格的括号
*/
public class ValidParentheses {
	public boolean isValid(String s) {
		if (s == null || s.length() == 0 || s.length() % 2 != 0) {
			return false;
		}

		Stack<Character> stack = new Stack<Character>();
		char[] cs = s.toCharArray();
		for (char c : cs) {
			if (c == '(' || c == '[' || c == '{') {
				stack.add(c);
			} else if (c == ')' || c == ']' || c == '}') {
				if (stack.size() == 0) {
					return false;
				}
				char cur = stack.pop();
				if ((cur == '(' && c == ')') || (cur == '[' && c == ']') || (cur == '{' && c == '}')) {
					continue;
				} else {
					return false;
				}
			}
		}

		return stack.size() == 0;
	}
}
