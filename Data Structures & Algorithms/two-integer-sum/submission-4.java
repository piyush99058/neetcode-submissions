class Solution 
{

    public static int[] twoSum(int[] nums, int target) 
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String [] args)
    {
        int nums[] = {3,4,5,6};
        int target = 7;
        int arr1[] = twoSum(nums,target);
        for(int ok : arr1){
            System.out.println(ok);
        }

    }
}
