package ScopeStudy;
class C {
    int v = 10;

    public void m() {
        int v = 20;
        System.out.println(v);
        System.out.println(this.v);
        /*
        * this란 ? instance 그 자체의 전역변수 관련 키워드.
        * */

        /*
        * why ? scope개념이 도입된건가 ?
        * 객체지향기반의 프로그래밍에서는 모든 메소드에 접근이 가능한 변수의 사용을 죄악시하는 경향이 있다.
        * */

    }
}

public class ScopeStudy2 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }
}
