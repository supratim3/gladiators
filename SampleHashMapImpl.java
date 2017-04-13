import java.util.HashMap;
import java.util.Iterator;


public class SampleHashMapImpl {

	public static void main(String[] args) {
		
		String s= "1";
		String g="5";
		String f= "7";
		String a="9";
		
		HashMap objHash=new HashMap<>();
		objHash.put("key1", s);
		objHash.put("key2", g);
		objHash.put("key3", f);
		objHash.put("key4", a);
		
		System.out.println("Sample OutPut");
		
		for (int i=0 ; i < objHash.size(); i++ )
		{
			System.out.println("Sample OutPut"+objHash.get(i));

		}

	}

}
