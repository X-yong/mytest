package test.test;

/**
 * ���ྲ̬��
 * ���ྲ̬��
 * ���ද̬��
 * ���๹��
 * ���ද̬��
 * ���๹��
 */


public class Test10 {

    public static void main(String[] args) {
        new Test102();
    }
}
class Test101 {
    static {
        System.out.println("���ྲ̬��");
    }
    {
        System.out.println("���ද̬��");
    }
    public Test101() {
        System.out.println("���๹��");
    }
}
class Test102 extends Test101{
    static {
        System.out.println("���ྲ̬��");
    }
    {
        System.out.println("���ද̬��");
    }
    public Test102() {
        System.out.println("���๹��");
    }
}