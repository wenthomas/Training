public class PrimeNumberPrint {
    public static void main(String[] args){
        int flag = 1;//状态1表示是质数，状态0表示不是质数
        for(int i = 2;i <= 10000;i++){
            flag = 1;//关键地方！！！！！每次循环均需重置flag。
            for(int j = 2;j < i;j++){
                if(i % j == 0){
                    flag = 0;
                    break;
                }
            }
            //状态1表示是质数，状态0表示不是质数，若判断为质数，则打印输出
            if(flag == 1){
                System.out.println(i);
            }
        }
    }
}
