package transcript;


public class MySection implements Section {
	private String id;

	public MySection(String id) {
		super();
		this.id = id;
	}

	@Override
	public String getId() {
		return id;
	}
	
	public String toString() {
		return id;
	}
	
}
