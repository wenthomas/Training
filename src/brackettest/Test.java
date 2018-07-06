package brackettest;

public class Test {
    public static void main(String[] args){
        BracketCheck b = new BracketCheck('(','[','{','}',']',')');
        System.out.println("结果： " + b.checking());
        //System.out.println(b.matchTheChar(']','['));

        BracketCheck c = new BracketCheck(']','[','}','{',')');
        System.out.println("结果： " + c.checking());

        BracketCheck d = new BracketCheck('[',']','(',')','{','}');
        System.out.println("结果： " + d.checking());
    }
}
