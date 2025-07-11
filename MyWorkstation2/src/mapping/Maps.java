package mapping;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//hashmap is nothing but a collection of pair two related things like 
		//employe name with there id.. or employ with his phone number kind of staffs
		
		
	//	Hashmap <>empID = new <>Hashmap();
		HashMap<String, Integer> empID = new HashMap<>();
		
		empID.put("Ashu", 6736436);
		empID.put("Almaz",9878338);
		empID.put("Corderl",7839843);
		empID.put("Mamo",6876879);
		// this are just to put out values
		// map dont take primitive data type.. int or float or any other primitives.. it take only Java type variables like String or Integer like that
		
		// lets use empID.get() to get some info
		// we use contains key to get the id
		// we use contains value to get name of the employe
		
		System.out.println(empID);
		System.out.println(empID.get("Corderl"));
		System.out.println(empID.containsKey("Ashu"));
		System.out.println(empID.containsValue(9878338));
		
		empID.put("pukunu", 1228474);
		System.out.println(empID);
		
		empID.replace("pukunu", 3672632);
		System.out.println(empID);
		
		empID.putIfAbsent("Heaven", 434344);
		System.out.println(empID);
		
		empID.remove("Corderl");
		System.out.println(empID);
		
		empID.remove("Mamo");
		System.out.println(empID);
		
		empID.remove("Almaz");
		System.out.println(empID);
		
		empID.remove("pukunu");
		System.out.println(empID);



	}

}
