public class ReverseInteger {
	public int reverse(int x) {
        String s = String.valueOf(x);
		if (x < 0) {
			s = s.substring(1);
		}
		StringBuilder sb = new StringBuilder();
		char[] cs = s.toCharArray();
		for (int i = cs.length - 1; i >= 0; i--) {
			sb.append(cs[i]);
		}
		Long finalVal = x < 0 ? -Long.valueOf(sb.toString()) : Long.valueOf(sb.toString());
		return finalVal.longValue() > Integer.MAX_VALUE || finalVal.longValue() < Integer.MIN_VALUE ? 0 : finalVal.intValue();
    }
}
