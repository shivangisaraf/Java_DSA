package DSA_JAVA;

public class recursion1NTo1 {
    public static void main(String[] args) {
//        fun(5);
        funRev(5);
    }
    static void fun(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int n){
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
}
