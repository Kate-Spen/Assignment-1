import java.util.*;
public class LongestCommonSubstring {
    public static int LCSubstring(String text1, String text2){
        int a = text1.length();
        int b = text2.length();
        int res = 0;
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                int curr = 0;
                while ((i + curr) < a && (j+curr)< b && text1.charAt(i+curr) == text2.charAt(j + curr)){
                    curr++;
                }
                res = Math.max(res, curr);
            }
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(LCSubstring("gears of war", "history of warriors"));
    }
}
