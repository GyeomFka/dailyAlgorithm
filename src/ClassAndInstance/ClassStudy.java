package ClassAndInstance;

public class ClassStudy {


    /**
     * 중복의 제거 -> 재활용성 -> 가독성, 유지보수 편의성
     *  Method의 활용 : Refactoring
     *  Method가 많아진다 -> 객체지향의 활용 (Grouping의 활용)
     */
    public static void main(String[] args) {
        TestStudy c1 = new TestStudy();
        TestStudy c2 = new TestStudy();
        System.out.println(c1.PI);
        System.out.println(c2.PI);
        System.out.println(TestStudy.PI);
        /*
        * c라는 변수는 TestStudy를 담을수있는 컨테이너이다
        * testClac 이녀석은 데이터 타입이다.(사용자 정의 데이터타입)
        * */
    }
}
class TestStudy{

    /*클래스 변수는 클래스를에 의해 만들어진 모든 인스턴스들은 클래스변수를 자연스럽게 가진다.*/
    static double PI = 3.14;
    //static한 변수란 ? 클래스에 소속이 된다. 모든 인스턴스에서 동일한 값을 가지고 온다.

    /*인스턴스 변수는 인스턴스 마다 다른값을 가질 수 있다.*/
    int left, right;


}


