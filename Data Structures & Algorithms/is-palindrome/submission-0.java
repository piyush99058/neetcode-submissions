class Solution {
    public boolean isPalindrome(String s) {
        String nonAplhaNumeric = s.replaceAll("[^a-zA-Z0-9]","");
        String lowerCase = nonAplhaNumeric.toLowerCase();
        String reversed = new StringBuilder(lowerCase).reverse().toString();
        if(lowerCase.equals(reversed))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
