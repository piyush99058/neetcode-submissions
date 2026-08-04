class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int num : nums)
        {
            set1.add(num);
        }
        int longest = 0;
        for(int num : set1)
        {
            if(!set1.contains(num -1))
            {
                int currentNum = num;
                int currentLength = 1;
            

            while(set1.contains(currentNum+1))
            {
                currentNum++;
                currentLength++;
            }
            
        
        longest =Math.max(longest,currentLength);
        }
        }
        return longest;
    }
}
