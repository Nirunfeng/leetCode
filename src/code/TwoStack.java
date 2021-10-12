package code.stack;

import java.util.Stack;

/**
 * TODO
 *
 * @author Ni runfeng
 * @description 获得最小数的栈
 * @email 2570034697@qq.com
 * @date 2021/9/5 22:53
 */
public class TwoStack {
    /*声明两个栈*/
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public TwoStack(Stack<Integer> stackData,Stack<Integer> stackMin){
        this.stackData=stackData;
        this.stackMin=stackMin;
    }

    public void push(Integer number){
        if(stackMin.isEmpty()||stackMin.pop()>number){
            stackMin.push(number);
        }

        stackData.push(number);
    }

    public void pop(){
        if(stackData.isEmpty()==false){

        }
    }
}
