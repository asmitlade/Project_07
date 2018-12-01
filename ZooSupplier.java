import java.util.Scanner;
import java.lang.reflect.*;
//import java.lang.Class;

class ZooSupplier {
	public static void main(String[] args) throws ClassNotFoundException,
													InstantiationException,
														IllegalAccessException,
															NoSuchMethodException,
																InvocationTargetException{
		try{
			Scanner scn = new Scanner(System.in);
			Zoo z1 = new Zoo();
			System.out.print("Enter animal name ::");
			Class<?> cls = Class.forName(scn.next());
			Object obj = cls.getDeclaredConstructor().newInstance();
			//Object obj = cls.newInstance();
			Animal a = (Animal)obj;
			z1.setAnimal(a);
		}
		catch(ClassNotFoundException cnf){
			System.out.println("Please enter anthor animal name");
		}
	}
}