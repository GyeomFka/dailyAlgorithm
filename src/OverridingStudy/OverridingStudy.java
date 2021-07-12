package OverridingStudy;

public class OverridingStudy {

    public static void main(String[] args) {
        SupCalculator.left = 3;
        SupCalculator.right = 10;
        SubCalculator.sum();
        System.out.println();
    }
    /*
    * ovverriding이란 : 재정의 라고한다.
    * 상속과 밀접한 개념
    *
    * 부모 메서드를 물려받아, 자식클래스 필요에 따라 재정의해서 기능을 변경해 사용한다.
    * */
    static class SupCalculator{
        static int left, right;
        public static void sum(){
            System.out.println(left + right);
        }
    }
    static class SubCalculator extends SupCalculator{
        public static void sum(){ //부모 클래스를 상속 받았지만, 자식클래스에서 재정의 가능하다
            /*
            * 우선순위는 자식클래스에서 정의된 메소드에 있다.
            * */
            //Method Overriding
            System.out.println(left+left+right+right);
        }
    }

    class Test{
        void a(int a){}
        void a(String a){}
        void a(){}  /*둘의 충돌*/
       //int a(){}   /*둘의 충돌*/
        int a(int a,int b){ /*충돌 할 내용이 없다.*/
            return 0;
        }
    }
    /*
    * 또한 알아야 할 것!!
    * Overriding의 기본조건,
    * <하위 클래스 오버라이딩된 메소드의 리턴타입 == 상위 클래스의 오버라이딩 메소드의 리턴타입>
    * 또한 이름도 같아야 하며, 매개변수도 같아야 한다 (형태, 갯수)
    * */



}
