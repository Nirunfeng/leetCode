package code.String;

import java.util.HashMap;
import java.util.Map;

/**
 * 题号3.无重复字符的最长子串
 */
public class Three {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            if (map.containsKey(s.charAt(end))) {
                //"dvdf" ，碰到第二个 d，那么应该移动 i 到 v 这个字
                //不可以这样写：start=map.get(s.charAt(end)),原因如上，应该移动到v处
                start =Math.max(map.get(s.charAt(end)),start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }
}
