package Abstract;

abstract class A{
    /*
    * 해당 Class의 멤버중 하나라도 Abstract Keyword 를 포함한다면
    * 해당 Class는 반드시 Abstract 클래스가 되어야한다.
    * */
    public abstract int b(); //추상 메소드 문법
//  public abstract int c(){ System.out.println("hi");} //abstract method는 정의되어서는 안된다.
    public void d(){
        System.out.println("D Method in Abstract");
    }
}

class B extends A { //A의 추상 Method를 활용해야한다. A의 abstract Method를 Overriding을해야한다.
    public int b() {
        return 0;
    }
}
public class AbstractStudy {
    public static void main(String[] args) {
        //A obj = new A();
        B obj = new B();
    }
}
