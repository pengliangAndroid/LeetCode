package com.funny;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
        System.out.println(obj.longestPalindrome2("babad"));
        System.out.println(obj.longestPalindrome2("a"));
        System.out.println(obj.longestPalindrome2("cbbd"));
    }

    public String longestPalindrome(String s) {
        int end = 0,start = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = extendPalindrome(s,i,i);
            int len2 = extendPalindrome(s,i,i+1);

            int len = Math.max(len1,len2);
            if(len > end - start){
                start = i - (len - 1)/2;
                end = i + len/2;
            }
        }

        return s.substring(start,end + 1);
    }

    public String longestPalindrome2(String s) {
        int len = 0;
        String result = null;

        for (int i = 0; i < s.length(); i++) {
            if(isPalindrome(s,i - len - 1, i)){
                result = s.substring(i - len - 1, i + 1);
                len += 2;
            }else if(isPalindrome(s,i - len , i)){
                result = s.substring(i - len, i + 1);
                len += 1;
            }
        }

        return result;
    }

    private int extendPalindrome(String s,int left,int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right - left - 1;
    }

    private boolean isPalindrome(String s,int start,int end){
        if(start < 0)
            return false;

        while (start < end){
            if(s.charAt(start++) != s.charAt(end--))
                return false;
        }

        return true;
    }
}
