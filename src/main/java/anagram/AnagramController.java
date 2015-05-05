package anagram;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AnagramController {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value= "/anagramfinder" )
	public Anagram AnagramFinder(@RequestParam(value="firstword") String firstword, @RequestParam(value="secondword") String secondword){
		AnagramFinderImp anagram = new AnagramFinderImp();
		boolean isAnagram = anagram.areAnagrams(firstword, secondword);
		return new Anagram(counter.incrementAndGet(), firstword, secondword, isAnagram);
	}
	
}
