package mapexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashmapExample {

	public static void main(String[] args) {
	   
		Map<String,String> obj = new Hashtable<String,String>();
		obj.put("rno","1001");
		obj.put("sname","xyz");
		Map<String,String> obj1 = new Hashtable<String,String>();
		obj.put("rno1","1002");
		obj.put("sname1","mno");
		List<String> arr = new ArrayList<String>();
		Set<Map.Entry<String,String>> se = obj.entrySet();
		for(Map.Entry<String,String> me:se)
		{
			arr.add(me.getValue());
		}
		

	}

}
