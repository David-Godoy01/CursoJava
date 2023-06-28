package pratice.strings;

public class StringsPratice {
	public static void main(String[] args) {
		
		String str = "Hello yogi there yogi there";
		
		int a = str.indexOf("yogi");
		
		int b = str.lastIndexOf("yogi");
		
		System.out.println(a);
		System.out.println(b);

		
		
	
	}

}




//String a ="hello";
//String b= "there";
//
//
//System.out.println(a.charAt(15));



//if(a == "hello") {
//	//THIS IS A TRAP, DON'T DO THIS
//}
//if(!a.equals("hello")) {
//	//USE THIS!!!
//}
//if(b.equalsIgnoreCase("ThEre")) {
//	System.out.println("Printed there");
//}