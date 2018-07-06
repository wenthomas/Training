package brackettest;

//注意：该类是由之前数组的栈实现方法搬过来用，当第一个是右括号时会有Bug，但不影响程序判断结果

public class StringStack{
    private char[] stack;
    int top;    //栈顶指针

    public StringStack(){

    }
    //设置栈长
    public StringStack(int a){
        this.stack = new char[a];
        this.top = -1;

    }

    private void printAll(){
        for(int i = 0;i <= this.top;i++){
            System.out.print(this.stack[i] + " ");
        }
        System.out.println();
        //System.out.println("Top: " + this.top);
    }
    public void push(char a){
        if(!isFull()){
            this.stack[++this.top] = a;
            //printAll();
        }
    }
    public char pop(){
        char popped = '\u0000';
        if(!isEmpty()){
            popped = this.stack[this.top--];
            //System.out.println("推出元素：" + popped);
        }
        return popped;  //问：如何完善此处返回内容？
    }
    //返回栈中一个元素，但不移除
    public char peek(int index){
        if(index < 0 || index > this.top){
            //System.out.println("栈索引获取有误！");
            return '\u0000';   //问：如何完善此处返回内容？
        }else{
            //System.out.println("返回元素：" + this.stack[index]);
            return this.stack[index];
        }
    }
    public boolean isFull(){
        if(this.top >= this.stack.length - 1){
            System.out.println("栈空间已满！");
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(this.top < 0){
            System.out.println("栈空间已空！");
            return true;
        }else{
            return false;
        }
    }

}