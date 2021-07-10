package ScopeStudy;

public class ScopeStudy {
    static int i; //전역번수 global variables
    /*
    * 유효범위 와 Scope
    * 유사한개념 - Directory개념과 유사
    *
    **/

    static void a(){
        i = 0; //유효범위 - Scope //지경번수 local variables
    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            a(); // a 안의 i라는 변수는 a 바깥의 변수에 영향을 끼치지 못한다.
            System.out.println(i);
        }
    }
}
