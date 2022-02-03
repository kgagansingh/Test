package question1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("raj", 95);
		map.put("ekta", 75);
		map.put("rajiv", 85);
		map.put("sunita", 66);
		map.put("gunika", 99);
		
		
//		1. print map using stream
		System.out.println("\n------printing map------\n");
		map.entrySet()
		.stream()
		.forEach(b->System.out.println("Name: "+ b.getKey()+" Marks: "+ b.getValue()));
		
		
//		2. print only that recrods that contain key contains raj
		System.out.println("\nprint only that recrods that contain key contains raj\n");
		map.entrySet()
		.stream()
		.filter(b->b.getKey()=="raj")
		.forEach(b->System.out.println("Name: "+ b.getKey()+" Marks: "+ b.getValue()));
		
//		3. print map sorted by key
		System.out.println("\nprint map sorted by key\n");
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(b->System.out.println("Name: "+ b.getKey()+" Marks: "+ b.getValue()));
		
//		4. print map sorted by values
		System.out.println("\nprint map sorted by values\n");
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())   
		.forEach(b->System.out.println("Name: "+ b.getKey()+" Marks: "+ b.getValue()));
		
//		5. print map reverse sorted by the key
		System.out.println("\nprint map reverse sorted by the key\n");
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey((b1,b2)->b2.compareTo(b1)))
		.forEach(b->System.out.println("Name: "+ b.getKey()+" Marks: "+ b.getValue()));
		
//		6. consider key as user define key:
		
		Map<Student, Integer> map2=new HashMap<>();
		map2.put(new Student(109, "raj", 95), 95);
		map2.put(new Student(61, "keta", 78), 78);
		map2.put(new Student(11, "gunika", 98), 98);
		map2.put(new Student(19, "keshav", 97), 97);
		
		

//		 Print all records sorted as per name of the student
		System.out.println("\nPrint all records sorted as per name of the student\n");
		map2.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey((b1,b2)-> b1.getName().compareTo(b2.getName())))
		.forEach(b->System.out.println(b));
		
//		 Print all records as per id of the student
		
		System.out.println("\nPrint all records as per id of the student\n");
		map2.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey((b1,b2)-> b1.getId()-b2.getId()))
		.forEach(b->System.out.println(b));
		


	}
}
