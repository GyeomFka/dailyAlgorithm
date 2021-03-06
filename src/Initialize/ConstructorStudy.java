package Initialize;

public class ConstructorStudy {
    /*
    * 사용자가 객체 사용에 있어서 실수 할 가능성이 있다.
    * 클래스 사용기능을 강제설정 해두면 된다.
    * */

    public ConstructorStudy() {//똑같은 이름의 매개변수.
/*
*값을 반환하지 않는다.
* 1)생성자는 인스턴스를 생성해주는 역할을 하는 특수한 메소드라고 할 수 있다. 그런데 반환 값이 있다면 엉뚱한 객체가 생성될 것이다.
* 따라서 반환 값을 필요로하는 작업에서는 생성자를 사용하지 않는다. 반환 값이 없기 때문에 return도 사용하지 않고,
* 반환 값을 메소드 정의에 포함시키지도 않는다.
* 2)생성자의 이름은 클래스의 이름과 동일하다.
* 자바에서 클래스의 이름과 동일한 메소드는 생성자로 사용하기로 약속되어 있다.
* */
    }
}
