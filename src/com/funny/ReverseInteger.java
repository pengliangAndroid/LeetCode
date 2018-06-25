package com.funny;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        System.out.println(obj.reverse(120));
        System.out.println(obj.reverse(-123));
        System.out.println(obj.reverse(-1209090999));
    }

    public int reverse(int x) {
        int ret = 0;

        while (x != 0) {
            int pop = x % 10;
            x = x / 10;

            if(ret > Integer.MAX_VALUE / 10 || (ret == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if(ret < Integer.MIN_VALUE / 10 || (ret == Integer.MIN_VALUE / 10 && pop < -8)) return 0;

            ret = ret * 10 + pop;
        }
        return ret;
    }
}
