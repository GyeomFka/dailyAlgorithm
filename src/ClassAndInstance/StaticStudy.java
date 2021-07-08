package ClassAndInstance;

public class StaticStudy {
    /*
    * Static :
    * 1) 인스턴스에 따라서 변하지 않는 값이 필요한 경우
    * 2) 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은경우
    * 3) 값의 변경 사항을 모든 인스턴스가 ＊공유＊ 해야 하는 경우
    * */

    /*
    * 인스턴스를 생성하지 않고, 메모리를 아끼며
    * 한번만 사용하며 메모리를 절약할 수 있다.
    * */

    /*
    * 1. 인스턴스 메소드는 클래스 맴버에 접근 할 수 있다.
    * 2. 클래스 메소드는 인스턴스 멤버에 접근 할 수 없다.
    * why ? 클래스가 먼저 메모리에 적재된다. -> 클래스 내부 인스턴스가 생선된다
    *  = 생성되지 않은 메소드에 접근하려고 하는거와 같다.
    * */
    /*
    *  인스턴수 변수 -> NON - Static Field (인스턴스를통해 접근이 가능하다.)
    *  클래식 변수 -> Static Field (클래스를 통해서도 접근이 가능하다)
    * */
    public static void main(String[] args) {
        StaticExample a1 = new StaticExample();
        StaticExample a2 = new StaticExample();
        StaticExample a3 = new StaticExample();

        System.out.println(a1.getA());
        System.out.println(a1.getB());
        System.out.println(a1.getC());

        a2.setB(8);
        StaticExample.setB(10);

        System.out.println(a1.getB());
        System.out.println(a2.getB());
        System.out.println(StaticExample.getB());

       //a1.setA(1);
        System.out.println(a1.getA());

        StaticExample.sum(4,2);
    }

}

class StaticExample{
    private final static int a = 5;
    private static int b ;
    private static int c = 0;
    public static int getA() {
        return a;
    }
    /*public static void setA(int a) {
        StaticExample.a = a;
    }*/

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        StaticExample.b = b;
    }

    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        StaticExample.c = c;
    }
    /*
    * 클래스 메소드
    * */

    public static void sum(int left, int right){
        System.out.println("SUMMETHOD : " + (left + right));
    }

}
