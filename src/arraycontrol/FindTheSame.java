package arraycontrol;

/*
    1,异或运算的特性:（位运算）相同结果为0，相异结果为1；
    2,任意数与0异或都为其本身；
    3，a^b^b = b;
    4,异或运算满足交换律及结合律
*/

//找到数组中不成对的元素
public class FindTheSame {
    public static void main(String[] args){

        FindTheSame a = new FindTheSame();

        System.out.println("单独元素为：" + a.seekSingle(new int[]{1,2,4,3,4,3,1}));

    }

    public static int seekSingle(int[] arr){
        int single = 0;
        //异或寻找单独元素
        for(int i = 0;i < arr.length;i++){
            single = single ^ arr[i];
        }
        return single;
    }
}

