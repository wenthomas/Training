package brackettest;

/**
 * 实现原理：利用栈的原理进行处理。
 * 1，输入一串由括号组成的char类型数组
 * 2，遍历数组，如果输出的是左括号，则推入栈中
 * 3，如果遍历输出的是右括号，则和栈顶元素对比是否匹配，匹配则将栈顶推出，继续遍历数组；如果不匹配，则返回结果“不成对”。
 * 4，遍历完成后，如果均匹配且栈空，则返回结果“成对”。
 */

import java.util.Arrays;
public class BracketCheck {
    private char[] string;
    public BracketCheck(){
    }
    public BracketCheck(char ... c){
        this.string = new char[c.length];
        System.out.print("待检测序列： ");
        for(int i = 0;i <  this.string.length;i++){
            this.string[i] = c[i];
            System.out.print(this.string[i] + " ");
        }
        System.out.println();
    }
    //遍历数组进行匹配检查
    public boolean checking(){
        StringStack stack = new StringStack(this.string.length);
        boolean isFlag = true;
        //1，遍历数组从左边开始获取元素，若是左括号则入栈；
        //2, 若是右括号则与栈顶元素匹配，返回匹配结果，若是不匹配，则直接返回最终结果不成对。
        for (int i = 0;i < this.string.length;i++){
            if(this.string[i] == '(' || this.string[i] == '[' || this.string[i] == '{'){
                stack.push(this.string[i]);
            }else{
                if(matchTheChar(this.string[i],stack.peek(stack.top))){
                    stack.pop();
                }else{
                    isFlag = false;
                    return isFlag;
                }
            }
        }
        return isFlag;
    }
    //字符配对判断
    public boolean matchTheChar(char source,char top){
        if(top == '('){
            if(source == ')'){
                return true;
            }else{
                return false;
            }
        }else if(top == '['){
            if(source == ']'){
                return true;
            }else{
                return false;
            }
        }else if(top == '{'){
            if(source == '}'){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

}
