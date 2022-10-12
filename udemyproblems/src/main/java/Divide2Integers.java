class Divide2Integers {
    public int divide(int dividend, int divisor) {
        
        if( divisor == -1 ){
            
            if( dividend == Integer.MIN_VALUE )
                
                return Integer.MAX_VALUE;
                
        }
        
        
        long a = Math.abs((long)divisor);
        
        long b = Math.abs((long)dividend);
        
        int result = 0;
        
        boolean sign = ( divisor<0 ^ dividend < 0);
        
        
        
        while( a <= b ){
            
            int shift = 0;
            
            while((a<<shift)<=b)
                
                shift++;
            
            result += (1<<(shift-1));
            
             b -= (a<<(shift-1));
            
        }
        
        return sign ? -result : result ;
    }
}
