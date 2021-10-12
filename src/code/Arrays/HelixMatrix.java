package code.Arrays;

/**
 * TODO
 *
 * @author Ni runfeng
 * @description 螺旋矩阵
 * @email 2570034697@qq.com
 * @date 2021/10/12 22:41
 * 输入n：代表数组的层数是n*n
 * 循环次数：loop=n/2
 * 定义起始填充位置：(0,0)
 * 偏移量为1,左闭右开
 * 从左至右，从右之下从下至左，从左至上
 */
public class HelixMatrix {

    public static void main(String[] args) {
        HelixMatrix a=new HelixMatrix();
        int res[][]=a.generateMatrix(3);
        for(int i=0;i<res.length;i++){
            for (int j=0;j<res.length;j++){
                System.out.println(res[i][j]);
            }
        }
    }
    public int[][] generateMatrix(int n){
        int[][] res=new int[n][n];

        //循环次数
        int loop=n/2;

        //定义每次循环变量起始位置
        int startX=0;
        int startY=0;

        //定义偏移量
        int offset=1;

        //定义填充数字
        int count=1;

        //定义中间位置
        int mid=n/2;

        while(loop>0){
            int i=startX;
            int j=startY;
            //上侧从左至右,左闭右开
            for(;j<startY+n-offset;++j){
                res[startX][j]=count++;
            }

            //模拟从右侧从上至下
            for(;i<startX+n-offset;++i){
                res[i][j]=count++;
            }

            //模拟下侧从右至左
            for(;j>startY;j--){
                res[i][j]=count++;
            }

            //模拟左侧从下至上
            for(;i>startX;i--){
                res[i][j]=count++;
            }

            loop--;

            startX+=1;
            startY+=1;

            offset+=2;
        }

        if (n % 2 == 1) {
            res[mid][mid] = count;
        }

        return res;
    }
}
