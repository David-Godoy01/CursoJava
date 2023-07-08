package lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		TreeMap<String, String> dictionary = new TreeMap<String, String>();
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "ready to face and endure danger or pain; showing courage.2");
		dictionary.put("Joy", "ready to face and endure danger or pain; showing courage.3");
		dictionary.put("Confidence", "ready to face and endure danger or pain; showing courage.4");

		dictionary.put("Brilliant", "xxxxxxxxxx");

//		for(String word: dictionary.keySet()) {
//			System.out.println(dictionary.get(word));
//		}
		for( Map.Entry<String, String> entry  : dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
