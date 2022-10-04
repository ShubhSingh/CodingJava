import java.util.*;
class MaxGap {
public int maximumGap(int[] nums)
{
Arrays.sort(nums);
int diff=Integer.MIN_VALUE;
if(nums.length<2)
{
diff=0;
}
else if(nums.length>=2)
{
for(int i=1;i<nums.length;i++)
{
if(nums[i]-nums[i-1]>diff)
{
diff=nums[i]-nums[i-1];
}
}
}
return diff;
}
}
