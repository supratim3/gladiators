import java.util.Date;
import java.util.HashSet;
import java.util.Set;

// Java program to print all permutations of a
// given string.
public class StringCombination
{
	public static Set<String> glyphesSet = new HashSet<>();
    
    public static int appearanceCount(int input1,int input2,String input3,String input4)
    {
//      if(input1 == 0 || input2 ==0 || input3 == null || input4 == null || input3.length() > input4.length()){ 
////    	  System.out.println("Total occ " + 0);
//    	  return 0;
//      }

      int i = 0;
      permutation(input3);
//      System.out.println("Set Size is "+glyphesSet.size() +" Set Values are " + glyphesSet);
      for(String glyphCombo : glyphesSet){
    	  i += count(input4,glyphCombo);
      }
      System.out.println("Total occ " + i);
      return i;
    }
    
    public static int count(final String string, final String substring)
    {
       int count = 0;
       int idx = 0;
       while ((idx = string.indexOf(substring, idx)) != -1)
       {
          idx++;
          count++;
       }
       return count;
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
    
    
//    public static int countMatch(String matchString, String puzzleWord){ 	
//    	Pattern p = Pattern.compile(matchString);
//    	Matcher m = p.matcher(puzzleWord);
//    	int cnt = 0;
//    	while (m.find()){
//    	    cnt +=1;
//    	}
//    	
//    	
//    	int occurance =  (puzzleWord.contains(matchString)) ? (puzzleWord.length() - puzzleWord.replace(matchString, "").length()) / matchString.length() : 0;
//    	
//    	
////    	String str = "helloslkhellodjladfjhello";
////    	String findStr = "hello";
//    	String str = puzzleWord;
//    	String findStr = matchString;    	
//    	int lastIndex = 0;
//    	int count = 0;
//
//    	while (lastIndex != -1) {
//
//    	    lastIndex = str.indexOf(findStr, lastIndex);
//
//    	    if (lastIndex != -1) {
//    	        count++;
//    	        lastIndex += findStr.length();
//    	    }
//    	}
//    	System.out.println(count);
////    	System.out.println(i); // Prints 2
//    	return count;
//    }    
    public static void main(String[] args)
    {
//      String str = "cAda";
//    	String str = "MexIco";
//    	String str = "Aa";
    	String str = "AA";    	
//    	String puzzleWord = "AbrAcadAbRa";
//    	String puzzleWord = "AbrAcadAbRaAcdaA";
    	String puzzleWord = "AAAaA";
//    	String puzzleWord = "thequickbrownfoxjumpsrightovertheLazydog";
//        String puzzleWord ="AaBMexIcobMexIcobFILbMexIcobMexIcobjMexIcobvMexIcobMexIcobMexIcobgMexIcobdMexIcobZVMexIcobMexIcobaMexIcob";
		long elapsedTime = 0L;
		long startTime = System.currentTimeMillis();
        appearanceCount(str.length(), puzzleWord.length(), str, puzzleWord);
		elapsedTime = (new Date()).getTime() - startTime;
		System.out.println("Combo size is " + glyphesSet.size() + " Time Taken " + elapsedTime);        
    }
    
    
//    /**
//     * Swap Characters at position
//     * @param a string value
//     * @param i position 1
//     * @param j position 2
//     * @return swapped string
//     */
//    public static String swap(String a, int i, int j)
//    {
//        char temp;
//        char[] charArray = a.toCharArray();
//        temp = charArray[i] ;
//        charArray[i] = charArray[j];
//        charArray[j] = temp;
//        return String.valueOf(charArray);
//    }    
// 
//    /**
//     * permutation function
//     * @param str string to calculate permutation for
//     * @param l starting index
//     * @param r end index
//     */
//    private static void permute(String str, int l, int r, String puzzleWord)
//    {
//        if (l == r){
////           System.out.println(str);   
//        	glyphesSet.add(str);
//        }
//        else
//        {
//            for (int i = l; i <= r; i++)
//            {
//                str = swap(str,l,i);
//                permute(str, l+1, r, puzzleWord);
//                str = swap(str,l,i);
//            }
//        }
////        return cnt;
//    }
}
 
