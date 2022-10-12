class FirstOccurence {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int len = haystack.length();
        int ans = -1;
        for(int i = 0 ; i <= len - n ; i++){
            if(haystack.substring(i,i+n).equals(needle)) {
                ans = i;
                break;
            }
        }
        return ans;
    }
    
}
