import pack.Addition;
import pack.Subtraction;


public class Use {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//packagename.classname obj=new packagename.classname();
		//pack.Addition obj=new pack.Addition(10,12.5);
		Addition obj=new Addition(10, 12.5);
		obj.sum();
		double res=Subtraction.sub(10, 12.5);
		System.out.println("subtraction ="+res);
	}

}
