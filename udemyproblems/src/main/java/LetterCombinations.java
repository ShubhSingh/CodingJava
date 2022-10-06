class LetterCombinations {
    List<String> res = new ArrayList();
    HashMap<Integer, char[]> map = new HashMap();
        
    public List<String> letterCombinations(String digits) {
        int len = digits.length();
        if(len == 0) return new ArrayList();
        map.put(2,new char[]{'a','b','c'});
        map.put(3,new char[]{'d','e','f'});
        map.put(4,new char[]{'g','h','i'});
        map.put(5,new char[]{'j','k','l'});
        map.put(6,new char[]{'m','n','o'});
        map.put(7,new char[]{'p','q','r','s'});
        map.put(8,new char[]{'t','u','v'});
        map.put(9,new char[]{'w','x','y','z'});
        
        traverse(digits, 0, new char[len]);
        return res;
    }
    private void traverse(String digits, int index, char[] ch){
        if(index >= digits.length()){
            res.add(new String(ch));
            return;
        }
        int digit = digits.charAt(index)-'0';
        char[] arr = map.get(digit);
        for(int i = 0; i<arr.length; i++){
            ch[index] = arr[i];
            traverse(digits, index+1, ch);            
        }
    }
}
