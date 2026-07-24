class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs)
        {
            char [] arr1 = str.toCharArray();
            Arrays.sort(arr1);
            String key = new String(arr1);

            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
            }
    //fetch key and add normal string string to the list
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
