import java.util.*;
public class LongestCommonSubstring {
    public static String LCSubstring(String text1, String text2){
        int a = text1.length();
        int b = text2.length();
        String res = "";
        //loops through every substring in the first word
        for (int i = 0; i < a; i++) {
            for (int j = i+1; j <= a; j++) {

                String ss1 = text1.substring(i,j);

                //loops through every substring in the second word
                for (int m = 0; m < b; m++) {
                    for (int n = m+1; n <= b; n++) {

                        String ss2 = text2.substring(m,n);

                        //checks both substrings and if they match it checks if its bigger than the current biggest
                        if(ss1.equals(ss2) && (ss1.length() > res.length()))
                        {
                            //replaces biggest if it is
                            res = ss1;
                        }
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(LCSubstring("gears of war", "history of warriors"));
    }
}
