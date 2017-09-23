public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        char[] cs = String.valueOf(x).toCharArray();
		int length = cs.length;
		if (length == 1) {
			return true;
		}
		for (int i = 0; i < length >> 1; i++) {
			if (cs[i] != cs[length - (i + 1)]) {
				return false;
			}
		}
		return true;
    }
}
