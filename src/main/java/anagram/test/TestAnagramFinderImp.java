package anagram.test;

import static org.junit.Assert.*;

import org.junit.Test;

import anagram.AnagramFinderImp;

public class TestAnagramFinderImp {

	@Test
	public void areAnagramSucces() {
		AnagramFinderImp anagram  = new AnagramFinderImp();
		boolean isAnagram = anagram.areAnagrams("scare", "cares");
		assertEquals(true, isAnagram);
	}
	
	@Test
	public void areAnagramFailure() {
		AnagramFinderImp anagram  = new AnagramFinderImp();
		boolean isAnagram = anagram.areAnagrams("welcome", "come to eat");
		assertEquals(false, isAnagram);
	}

}
