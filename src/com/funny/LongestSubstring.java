package com.funny;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        LongestSubstring obj = new LongestSubstring();
        System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(obj.lengthOfLongestSubstring("bbbbb"));
        System.out.println(obj.lengthOfLongestSubstring("pwwkew"));
        System.out.println(obj.lengthOfLongestSubstring("aab"));
        System.out.println(obj.lengthOfLongestSubstring("c"));
        System.out.println(obj.lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {
        int length = s.length(),ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0,j = 0; j < length; j++) {
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }

            ans = Math.max(ans,j - i + 1);
            map.put(s.charAt(j),j + 1);
        }

        return ans;
    }
}
