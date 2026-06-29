import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        // int len = 0;
        // HashMap<Character, Integer> map = new HashMap<>();

        // for (int i = 0; i < s.length(); i++) {
        //     map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        // }

        // boolean oddFound = false;

        // for (char key : map.keySet()) {
        //     int count = map.get(key);
        //     if (count % 2 == 0) {
        //         len += count;
        //     } else {
        //         len += count - 1;
        //         oddFound = true;  
        //     }
        // }

        // if (oddFound) {
        //     len += 1;
        // }

        // return len;

        int[] temp = new int[128];
        int ans = 0;
        for(char t : s.toCharArray()){

            if(temp[t] == 1){
                ans += 2;
                temp[t] = 0;
            }else{

                temp[t]++;
            }    
        }

                return ans<s.length()?ans+1:ans;
    }
}