package stacktest;

public class ArrayToStack {

    private int[] stack;
    int top;    //栈顶指针

    public ArrayToStack(){

    }
    public ArrayToStack(int a){
        this.stack = new int[a];
        this.top = -1;

    }

    private void printAll(){
        for(int i = 0;i <= this.top;i++){
            System.out.print(this.stack[i] + " ");
        }
        System.out.println();
        //System.out.println("Top: " + this.top);
    }
    public void push(int a){
        if(!isFull()){
            this.stack[++this.top] = a;
            printAll();
        }
    }
    public int pop(){
        int popped = 0;
        if(!isEmpty()){
            popped = this.stack[this.top--];
            System.out.println("推出元素：" + popped);
        }
        return popped;  //问：如何完善此处返回内容？
    }
    //返回栈中一个元素，但不移除
    public int peek(int index){
        if(index < 0 || index > this.top){
            System.out.println("索引有误！");
            return 0;   //问：如何完善此处返回内容？
        }else{
            System.out.println("返回元素：" + this.stack[index]);
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
