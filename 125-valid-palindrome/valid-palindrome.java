class Solution {
    public boolean isPalindrome(String s) {
        /*StringBuilder clean = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ch = Character.toLowerCase(ch);
                clean.append(ch);
            }
        }
        StringBuilder rev = new StringBuilder(clean);
        rev.reverse();
        return clean.toString().equals(rev.toString());*/

        int l = 0;
        int r = s.length()-1;
        while(l< r){
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;

        }
        return true;
    }
}