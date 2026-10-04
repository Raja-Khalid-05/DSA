// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n = nums.length;
//         Set<List<Integer>> st = new HashSet<>();
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 for (int k = j + 1; k < n; k++) {
//                     if (nums[i] + nums[j] + nums[k] == 0) {
//                         List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
//                         Collections.sort(temp);
//                         st.add(temp); 
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(st); 
//     }
// }

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i + 1;
            int r = n-1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum <0){
                    l++;
                }else if(sum > 0){
                    r--;
                }else{
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(l< r && nums[r] == nums[r+1]){
                        r--;
                    }
                }
            }
        }
        return res;
    }
}

