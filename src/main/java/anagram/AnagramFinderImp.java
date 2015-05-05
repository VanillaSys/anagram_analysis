package anagram;

import java.util.Arrays;

public class AnagramFinderImp implements AnagramFinder {

	@Override
	public boolean areAnagrams(String s1, String s2) {
		
		//clean Strings from whitespace
		String firstword = s1.toLowerCase().replaceAll("//s", "");
		String secondword = s2.toLowerCase().replaceAll("//s", "");
		
		//obtain a char array to later sort them in a new string
		char[] firstwordarray = firstword.toCharArray();
		char[] secondwordarray = secondword.toCharArray();
		
		Arrays.sort(firstwordarray);
		Arrays.sort(secondwordarray);
		
		String firstwordsorted = new String(firstwordarray);
		String secondwordsorted = new String(secondwordarray);
		
		return firstwordsorted.equals(secondwordsorted);	
		
	}
	
}
