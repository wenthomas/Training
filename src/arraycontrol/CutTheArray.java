package arraycontrol;
/*
数组去重示例
 */

import java.util.Scanner;
public class CutTheArray {
    public static void main(String[] args){
        int[] list_new = cutTheCopy(setTheArray());
        printTheArray(list_new);
    }

    //cutTheCopy:去重函数
    static int[] cutTheCopy(int[] arr){

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
            if(flag == true){
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
}

