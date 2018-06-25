package com.funny;

public class ZigZag {
    public static void main(String[] args) {
        ZigZag obj = new ZigZag();
        System.out.println(obj.convert("PAYPALISHIRING",3));
        System.out.println(obj.convert("PAYPALISHIRING",4));
        System.out.println(obj.convert("A",1));
        System.out.println(obj.convert("ABCD",3));
    }

    public String convert(String s, int numRows) {
        if(numRows < 2)
            return s;

        int countColumn = s.length() / (2 * numRows - 2);
        int lastCount = s.length() % (2 * numRows - 2);

        countColumn = countColumn * (numRows - 1);
        if(lastCount > 0){
            if(lastCount > numRows) {
                countColumn += 1 + lastCount - numRows;
            }else{
                countColumn += 1;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < countColumn; j++) {
                if(2*j + i >= s.length())
                    break;

                if(j % (numRows - 1) == 0 || (i + j) % (numRows - 1) == 0){
                    sb.append(s.charAt(2*j + i));
                    System.out.print(s.charAt(2*j + i));
                }

                System.out.print("\t");
            }

            System.out.println();

        }
        return sb.toString();
    }
}
