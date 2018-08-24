package transcript;


public class MyGrade implements Grade{

	private String value;

	public MyGrade(String value) {
		super();
		this.value = value;
	}

	@Override
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
