class Solution {
    public static boolean hasDuplicate(int[] nums) 
    {
            // int n = nums.length - 1;
            Set <Integer> set1 = new HashSet<>();

            for(int i=0;i<nums.length;i++)
            {
                set1.add(nums[i]);
            }
            if(nums.length != set1.size())
            {
                return true;
            }
            return false;
    }

    public static void main(String [] args)
    {
        int nums[] = {1, 2, 3, 3};
        //Solution s1 = new Solution();
        boolean result = hasDuplicate(nums);
        if(result)
        {
            System.out.println(true);
        }
        else{
                System.out.println(false);
        }
    }
}