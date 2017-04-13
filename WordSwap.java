import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class WordSwap {
	public static Set<String> glyphesSet = new HashSet<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		permute("MexIcobMexIcobFILbMexIcobMexIcobjMexIcobvMexIcobMexIcobMexIcobgMexIcobdMexIcobZVMexIcobMexIcobaMexIcob");
		long elapsedTime = 0L;
		long startTime = System.currentTimeMillis();
//		permute("MexIcoedfg");
		permutation("Aa");
		elapsedTime = (new Date()).getTime() - startTime;
		System.out.println("Combo size is " + glyphesSet.size() + " Time Taken " + elapsedTime);
	}
	
	public static void permute(String s) {
	    if(null==s || s.isEmpty()) {
	        return;
	    }

	    // List containing words formed in each iteration 
	    List<String> strings = new LinkedList<String>();
	    strings.add(String.valueOf(s.charAt(0))); // add the first element to the list

	     // Temp list that holds the set of strings for 
	     //  appending the current character to all position in each word in the original list
	    List<String> tempList = new LinkedList<String>(); 

	    for(int i=1; i< s.length(); i++) {

	        for(int j=0; j<strings.size(); j++) {
	            tempList.addAll(merge(s.charAt(i), strings.get(j)));
	                        }
	        strings.removeAll(strings);
	        strings.addAll(tempList);

	        tempList.removeAll(tempList);

	    }

//	    for(int i=0; i<strings.size(); i++) {
//	        System.out.println(strings.get(i));
//	    }
	}

	/**
	 * helper method that appends the given character at each position in the given string 
	 * and returns a set of such modified strings 
	 * - set removes duplicates if any(in case a character is repeated)
	 */
	private static Set<String> merge(Character c,  String s) {
	    if(s==null || s.isEmpty()) {
	        return null;
	    }

	    int len = s.length();
	    StringBuilder sb = new StringBuilder();
	    Set<String> list = new HashSet<String>();

	    for(int i=0; i<= len; i++) {
	        sb = new StringBuilder();
	        sb.append(s.substring(0, i) + c + s.substring(i, len));
	        list.add(sb.toString());
	    }

	    return list;
	}
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) 
	    	glyphesSet.add(prefix);//System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}	

}
