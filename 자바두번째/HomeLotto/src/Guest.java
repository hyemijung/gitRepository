public class Guest {
	
	String name = "";
	int age = 0;
	String id ="";
	String id2 = "";
	
	
	public Guest() {
		super();
	}


	public Guest(String name, int age, String id, String id2) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.id2 = id2;
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


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getId2() {
		return id2;
	}


	public void setId2(String id2) {
		this.id2 = id2;
	}


	
	
	
	@Override
	public String toString() {
		return "Guest [name=" + name + ", age=" + age + ", id=" + id + ", id2=" + id2 + "]";
	}
	
	
	
}
