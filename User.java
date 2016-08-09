package lesson6;

public class User {
	
	private String name;
	private int age;
	private boolean married;
	private char lovelyWord;
	private String liveTown;
	
	public User(String name, int age, boolean married, char lovelyWord, String liveTown) {
			super();
			this.name = name;
			this.age = age;
			this.married = married;
			this.lovelyWord = lovelyWord;
			this.liveTown = liveTown;
		}
	
	@Override public boolean equals(Object obj) {
        if (this == obj) return true;
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		User that = (User) obj;
		return this.getAge() == that.getAge() && this.getAge() == that.getAge() && this.getMarried() == that.getMarried() && this.getLovelyWord() == that.getLovelyWord() && this.getLiveTown() == that.getLiveTown();
	}
	
	@Override public int hashCode() {
		
		final int prime = 17;
		int result = 1;
		
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + age;
		result = prime * result + (married ? 1231 : 1237);
		result = prime * result + lovelyWord;
		result = prime * result + ((liveTown == null) ? 0 : liveTown.hashCode());
		
		return result;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean getMarried() {
		return married;
	}
	
	public void setMarried(boolean married) {
		this.married = married;
	}
	
	public char getLovelyWord() {
		return lovelyWord;
	}
	
	public void setLovelyWord(char lovelyWord) {
		this.lovelyWord = lovelyWord;
	}
	
	public String getLiveTown() {
		return liveTown;
	}
	
	public void setLiveTown(String liveTown) {
		this.liveTown = liveTown;
	}
	
}
