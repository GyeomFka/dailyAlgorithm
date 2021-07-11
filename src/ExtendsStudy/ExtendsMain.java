package ExtendsStudy;

public class ExtendsMain {

    public static void main(String[] args) {
        SuperClass.a = 1;
        SuperClass.b = 6;

        SubClass a = new SubClass();
        a.test();
    }
}
