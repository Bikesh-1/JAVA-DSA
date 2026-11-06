package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class gfg {
    public int romanToInt(String s) {
        int n = s.length();
        int count = 0;
        for(int i = 0; i<n ; i++){
            if(s.charAt(i)=='I'&&s.charAt(i+1)=='V'){
                count += 4;
            }
            if(s.charAt(i)=='I'&&s.charAt(i+1)=='X'){
                count += 9;
            }
            if(s.charAt(i)=='X'&&s.charAt(i+1)=='L'){
                count += 40;
            }
            if(s.charAt(i)=='X'&&s.charAt(i+1)=='C'){
                count += 90;
            }
            if(s.charAt(i)=='C'&&s.charAt(i+1)=='D'){
                count += 400;
            }
            if(s.charAt(i)=='C'&&s.charAt(i+1)=='M'){
                count += 900;
            }
            if(s.charAt(i)=='I'){
                count += 1;
            }
            if(s.charAt(i)=='V'){
                count += 5;
            }
            if(s.charAt(i)=='X'){
                count += 10;
            }
            if(s.charAt(i)=='L'){
                count += 50;
            }
            if(s.charAt(i)=='C'){
                count += 100;
            }
            if(s.charAt(i)=='D'){
                count += 500;
            }
            if(s.charAt(i)=='M'){
                count += 1000;
            }
        }
        return count;
    }

}
