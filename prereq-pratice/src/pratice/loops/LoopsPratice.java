package pratice.loops;

public class LoopsPratice {
	public static void main(String arg[]) {

		int counter = 0;

		for (int idx = 0; idx < 100; idx++) {

			for (int j = 0; j < 100; j++) {

				System.out.println("the value of idx was " + idx + " ----- " + j);
				counter++;
			}

		}
		System.out.println("COUNTER: "+counter);

	}

}

//	String name="dsafdsfassa";
//	
//	for (int i = name.length()-1; i >= 0; i--) {
//		System.out.println("char: "+name.charAt(i));}

//
//String str = "We have a large invetory of things in our warehouse falling in "
//+"the category:apperal and the slightly"
//+"more in demand category:makeup along with the category:furniture and ...";
//
//printCategories(str);
//}
///**
//* 
//* extract all categories from string argument
//* @param str
//*/
//
//public static void printCategories(String str) {
//int i= 0;
//while(true) {
//	int found = str.indexOf("category:", i);
//	if(found == -1)break;
//	int start = found +9;//start of the actual category
//	int end = str.indexOf(" ",start);
//	System.out.println(str.substring(start,end));
//	i = end +1;
//}

//int a=0;
//while(a>-1) {
//	
//	if(a<115) {
//	 a =str.indexOf("category",a);
//	 System.out.println(str.substring(a,a+16));
//	 
//	a++;
//	}
//	else {
//		a= str.indexOf("category",a);
//		System.out.println(str.substring(a,a+18));
//		
//		break;
//	}
//	
//

//str.substring(a,a+16)

//int count=0;
//
//
//while(count <= 100) {
//	System.out.println("David: "+count);
//	count = count +1;
//	
//	if(count == 30) {
//		break;
//	}
//}
//