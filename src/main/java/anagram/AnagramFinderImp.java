package anagram;

import java.util.Arrays;

public class AnagramFinderImp implements AnagramFinder {

	@Override
	public boolean areAnagrams(String s1, String s2) {
		
		//clean Strings from whitespace
		String firstword = trim_whitespaces_and_sort(s1);
		String secondword = trim_whitespaces_and_sort(s2);
		
		
		return firstword.equals(secondword);	
		
	}
	
	private String trim_whitespaces_and_sort(String word){
		
		String original_trimed = word.toLowerCase().replaceAll("//s", "");
		char[] word_array = original_trimed.toCharArray();
		Arrays.sort(word_array);
		
		return new String(word_array);
	}
	
}
