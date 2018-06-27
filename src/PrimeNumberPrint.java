

public class PrimeNumberPrint {
    public static void main(String[] args){
//        int flag = 1;//状态1表示是质数，状态0表示不是质数 //todo：这种判断用boolean，与c不同，不要使用1和0
//        for(int i = 2;i <= 10000;i++){
//            flag = 1;//关键地方！！！！！每次循环均需重置flag。
//            for(int j = 2;j < i;j++){
//                if(i % j == 0){
//                    flag = 0;
//                    break;
//                }
//            }
//            //状态1表示是质数，状态0表示不是质数，若判断为质数，则打印输出
//            if(flag == 1){
//                System.out.println(i);
//            }
//        }
        System.out.println(isPrimeNumber(5));

        findPrimes(100);
    }


    /*
        1.面向对象的设计原则是功能单一，便于维护，可读性高，耦合性小
        2.对于质数，有很多种算法，对硬算来说，一直到这个数到开方就可以了
     */
    public static boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void findPrimes(int range) {
        for (int i = 2; i <= range; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

}
