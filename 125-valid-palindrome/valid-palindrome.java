class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ch = Character.toLowerCase(ch);
                clean.append(ch);
            }
        }
        StringBuilder rev = new StringBuilder(clean);
        rev.reverse();
        return clean.toString().equals(rev.toString());
    }
}