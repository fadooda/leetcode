class Solution {
public int removeElement(int[] nums, int val) {
     int length=nums.length;
        for (int i=0; i<length;i++)
        {  
            if (nums[i]==val)
            {   
                length--;
                if (length > 0 )
                {
                    System.out.println(length);
                    while( length > 0 && i !=length && nums[length]==val )
                    {
                        length--;
                    }
                    nums[i]=nums[length];
                    nums[length]= val; 
                }
            }          
        }
        return length;
}
}