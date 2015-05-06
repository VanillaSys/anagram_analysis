package anagram;

import java.util.Arrays;

public class AnagramFinderImp implements AnagramFinder {

	@Override
	public boolean areAnagrams(String s1, String s2) {
		
		//clean Strings from whitespace
		String firstword = prepare_string(s1);
		String secondword = prepare_string(s2);
		
		
		return firstword.equals(secondword);	
		
	}
	
	private String prepare_string(String word){

		String original = word.toLowerCase().replaceAll("\\s","");
		char[] word_array = original.toCharArray();
		Arrays.sort(word_array);
		
		return new String(word_array);
	}
	
}
