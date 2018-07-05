package hanoitest;


public class HanoiTest {
    public static void main(String[] args){
        int amount = 3;
        System.out.println("圆盘个数：" + amount);
        hanoi(amount,'A','B','C');
    }

    //移动方法
    public static void move(int a,char from,char to){
        System.out.println(a + " from " + from + " to " + to);
    }

    //汉诺塔递归算法
    public static void hanoi(int amount,char source,char temp,char destinate){
        if(amount == 1){
            move(1,source,destinate);
        }else{
            hanoi(amount - 1,source,destinate,temp);
            move(amount,source,destinate);
            hanoi(amount - 1,temp,source,destinate);
        }
    }
}
