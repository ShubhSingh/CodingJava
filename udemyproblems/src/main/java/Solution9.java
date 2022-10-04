class Solution9 {
    public int longestCommonSubsequence(String text1, String text2) {
        return LCSM4(text1.toCharArray(), text2.toCharArray(), text1.length(), text2.length());
    }
    
    public static int LCSM4(char[] X, char[] Y, int m, int n) {
		int memo[] = new int[n + 1];

		for (int i = 1; i <= m; i++) {
			int prev = 0;
			for (int j = 1; j <= n; j++) {
				int temp = memo[j];
				if (X[i - 1] == Y[j - 1]) {
					memo[j] = prev + 1;
				} else {
					memo[j] = Math.max(memo[j], memo[j - 1]);
				}
				prev = temp;
			}

		}
		return memo[n];
	}
}
