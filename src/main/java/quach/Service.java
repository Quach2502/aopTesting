package quach;

public class Service {

	public void divideWithCatch(){
		System.out.println("Begin divideWithCatch()...");
		int a = 3;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Catch block...");
		}
//		int c = a/b;
	}

	public void divideWithoutCatch() throws Exception {
		System.out.println("Begin divideWithoutCatch()...");
		int a = 3;
		int b = 0;
		int c = a / b;
		System.out.println(c);

	}
}
