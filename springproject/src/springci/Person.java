package springci;

public class Person {

	
	private String name;
	private int id;
	private int age;
	private Certi cer;
	
	
		public Person(String name, int id, int age, Certi cer) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.cer = cer;
	}


	@Override
	public String toString() {
		
		
		return this.name+" : "+this.age+" : "+this.id+" {"+this.cer.cName+" }";
	}


}
