package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		
		double [] values =new double [100];
		values[0]= 10000;
		values[1] = 33.44;
		values[99]=69595;
		
		System.out.println(values[0]);
		
		String [] words = new String [3] ;
		words[0]= "My";
		words[1]="Name";
		words[2]="is";
		
		System.out.println(words[0]);
		
		words= new String[10];
		
		System.out.println(words[2]);
	}

}
