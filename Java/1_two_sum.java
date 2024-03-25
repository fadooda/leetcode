import java.lang.reflect.Array;
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
    	int x=0;
    	for(int elm : nums)
    	{
    		hmap.put(elm,x);
    		x++;
    	}
        for (int i=0; i<nums.length;i++)
        {
            Integer numtarg=target-nums[i];
            
            if (hmap.containsKey(numtarg) && i!=hmap.get(numtarg))
            {
                int[] randomArray = {i,hmap.get(numtarg)};
                return randomArray;
            }

        }
        int[] randomArray = {0,0};
        return randomArray; 
    }
}