package test.test;

public class TestReturn {

	public static void main(String[] args) {
		
		try {
			throw new RuntimeException("�쳣��");
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
			throw new RuntimeException();
		}
	}

}
