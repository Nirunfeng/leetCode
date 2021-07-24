package code.String;

/**
 * TODO
 *
 * @author Ni runfeng
 * @description 题号6.Z字形变换代码
 * @email 2570034697@qq.com
 * @date 2021/7/24 23:37
 */
public class Six {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;

        int len = Math.min(s.length(), numRows);
        String []rows = new String[len];
        for(int i = 0; i< len; i++) rows[i] = "";
        int loc = 0;
        boolean down = false;

        for(int i=0;i<s.length();i++) {
            rows[loc] += s.substring(i,i+1);
            if(loc == 0 || loc == numRows - 1)
                down = !down;
            loc += down ? 1 : -1;
        }

        String ans = "";
        for(String row : rows) {
            ans += row;
        }
        return ans;
    }
}
