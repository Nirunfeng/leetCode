package code.String;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ni runfeng
 * @description 题号10.正则表达式匹配
 * @email 2570034697@qq.com
 * @date 2021/8/2 22:05
 */
public class Ten {
    public boolean isMatch(String s, String p) {
        return dfs(new HashMap(), s, p);
    }

    private boolean dfs(Map<Pair,Boolean> cache, String s, String p) {
        Pair pair = new Pair(s,p);
        //加个记忆化，不然纯递归会超时的
        if(cache.containsKey(pair)) {
            return cache.get(pair);
        }
        if(p.isEmpty()) {
            return s.isEmpty();
        }
        //检查s[0]和p[0]是否匹配
        boolean isFirstMath = s.length() > 0 && (p.charAt(0) == '.' || p.charAt(0) == s.charAt(0));
        //检查模式串的下个字符是否为"*
        boolean isMatchAny = p.length() > 1 && p.charAt(1) == '*';
        if(isMatchAny) {
            //如果包含"*"，可以忽略掉当前字符+*
            //也可以忽略掉字符串中的当前字符(如果能匹配上)
            cache.put(pair, dfs(cache, s, p.substring(2)) || (isFirstMath && dfs(cache, s.substring(1), p)) );
        }
        else {
            //单个字符匹配的情况
            cache.put(pair, isFirstMath && dfs(cache, s.substring(1), p.substring(1)) );
        }
        return cache.get(pair);
    }
}
