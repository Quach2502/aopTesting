package quach;

public class Application {
	
	public static void main(String[] args) throws Exception {
		Service service = new Service();
		System.out.println("Begin...");
		try {
		service.divideWithCatch();}
		catch (Exception e){
			System.out.println("Testing...");
		}
		service.divideWithoutCatch();

	}

}
