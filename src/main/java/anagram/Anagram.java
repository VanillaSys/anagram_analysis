package anagram;

public class Anagram {
	private final long id;
	private final String firstword;
	private final String secondword;
	private final boolean isAnagram;
	
	public Anagram(long id, String firstword, String secondword, boolean isAnagram) {
		this.id = id;
		this.firstword = firstword;
		this.secondword = secondword;
		this.isAnagram = isAnagram;
		
	}
	
	public long getId() {
		return id;
	}
	
	public String getFirstword() {
		return firstword;
	}
	
	public String getSecondword() {
		return secondword;
	}
	
	public boolean getIsAnagram(){
		return isAnagram;
	}
	
}
