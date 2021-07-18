package code.String;

/**
 * 题号5.最长回文子串
 */
public class Five {
    public String longestPalindrome(String s) {
        if(s.equals("")){
            return "";
        }

        //对字符串进行操作
        //1.备份原始字符串s
        String origin=s;
        //2.倒置源字符串s
        String reverse=new StringBuffer(s).reverse().toString();
        //获取长度
        int length=s.length();
        int [][] arr=new int[length][length];
        int maxLen=0;
        int maxEnd=0;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(origin.charAt(i)==reverse.charAt(j)){
                    if(i==0||j==0){
                        arr[i][j]=1;
                    }else{
                        arr[i][j]=arr[i-1][j-1]+1;
                    }
                }
                if(arr[i][j] > maxLen){
                    maxLen = arr[i][j];
                    maxEnd = i; //以 i 位置结尾的字符
                }
            }
        }
        return s.substring(maxEnd - maxLen + 1, maxEnd + 1);
    }
}
