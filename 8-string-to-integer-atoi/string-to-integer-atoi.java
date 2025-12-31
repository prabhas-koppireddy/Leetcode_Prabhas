class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int i = 0, sign = 1, n = s.length();

        if(s.isEmpty()) return 0;
        if(s.charAt(i) == '-' || s.charAt(i) == '+'){ 
            sign = (s.charAt(i) == '-')?-1:1;
            i++;
        }
        long num = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            num = (num * 10) + (s.charAt(i) - '0');
            if(num * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(num * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(num*sign);
    }
}