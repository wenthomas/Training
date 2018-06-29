package arraycontrol;
/*
数组去重示例
 */

import java.util.Scanner;
public class CutTheArray {
    public static void main(String[] args){
//        int[] list_new = cutTheCopy(setTheArray());
//        printTheArray(list_new);
        int[] ints = cutDuplicates(new int[]{3, 3, 5, 6, 7, 7, 7, 5});
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }

    }

    //cutTheCopy:去重函数
    private static int[] cutTheCopy(int[] arr){ // todo: 最好加上修饰符，默认修饰符为包可用，没有啥意义

        //临时变量用于得出去重后数组的长度
        int length_new = 0;
        //临时数组
        int[] temp = new int[arr.length];

        //查重
        for (int i = 0;i < arr.length;i++){
            boolean flag = true;
            for (int j = i + 1;j < arr.length;j++){
                if(arr[i] == arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){  // todo： 不用写成 flag == true 多余了
                temp[length_new] = arr[i];
                length_new += 1;
            }
        }

        //赋值给新数组，该数组即为去重后的结果
        int[] arr_new = new int[length_new];
        for(int i = 0;i < length_new;i++){
            arr_new[i] = temp[i];
        }
        return arr_new;
    }

    //setTheArray:输入数组
    static int[] setTheArray(){
        //输入待去重数组
        Scanner s = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int length = s.nextInt();
        int[] list = new int[length];
        for (int i = 0;i < length;i++){
            System.out.println("请输入数组的第" + (i+1) + "个元素：");
            list[i] = s.nextInt();
        }
        //打印该数组
        printTheArray(list);
        System.out.println("--------------------------------");
        return list;
    }

    //printTheArray:打印数组
    static void printTheArray(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }





    // todo：以下这种的思路是map key的思路，要稍微注意以下
    // 另外，在你用到什么重置的时候就要想一下了，其实可以用一个方法代替，而不是设定来设定去
    // todo: 其中隐藏了一个bug，请查收并修改
    private static int[] cutDuplicates(int[] source) {
        int[] temp = new int[source.length];
        int length = 0;
        for (int i : source) {
            if (!isDuplicates(i, temp)) {
                temp[length++] = i;
            }
        }
        int[] result = new int[length];
        System.arraycopy(temp, 0, result, 0, length);
        return result;
    }

    private static boolean isDuplicates(int target, int[] source) {
        boolean flag = false;
        for (int i : source) {
            if (target == i) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

