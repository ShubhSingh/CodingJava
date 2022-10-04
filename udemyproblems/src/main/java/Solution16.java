class Solution16 {
    public int maximumSwap(int num) 
    {
        int max_digit =0;
        int d = 0;
        int temp =1,index=1;
        int n = num;
        
        while(n > 0)
        {
            int digit = n % 10;
            n = n/10;
            
            if(max_digit > digit)
                d = Math.max(d , (max_digit-digit) * (temp-index));
            
            else if(max_digit < digit)
            {
                max_digit = digit;
                index = temp;
            }
            
            temp = temp*10;
        }
        
        return num + d;
    }
}
