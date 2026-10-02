class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        generate(0, 0, n, "", ans);
        return ans;
    }
    public void generate(int O, int C ,int n, String curr, List<String> ans){
        if(O == C && O+C == 2*n){
            ans.add(curr);
            return;
        }
        if(O<n){
            generate(O+1, C, n, curr + '(', ans);
        }
        if(C<O){
            generate(O, C+1, n, curr + ')', ans);
        }
    }
}