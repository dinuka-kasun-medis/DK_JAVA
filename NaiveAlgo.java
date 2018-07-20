class NaiveAlgo{
	private static void search(String txt, String pat){
		int m=txt.length();
		int n=pat.length();
		for (int i=0; i<=m-n ;i++ ) {
			int j=0;
			for (;j<n ;j++ ) {
				if (txt.charAt(i+j)!=pat.charAt(j)) {
					break;
				}
			}
			if (j==n) {
				System.out.println("Pattern found at :"+i);
			}
		}
	}

	public static void main(String args[]){
		String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        search(txt,pat);
	}
}
