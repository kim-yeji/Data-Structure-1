package transcript;

import java.util.*;


public class MyStudent implements Student {
	private String name;
	private boolean male;
	private int yob;
	private Transcript transcript = new Transcript();
	
	
	public MyStudent(String name, boolean male, int yob) {
		
		this.name = name; //생성하면서 바로 만들어져서 세터 필요없음
		this.male = male;
		this.yob = yob;
	}



	@Override
	public void updateTranscript(MySection section, MyGrade grade) {
		transcript.add(section,grade);
	}


	@Override
	public void printTranscript() {
		System.out.println(getName());
		System.out.println(transcript);
	}

	private class Transcript{
		Map map = new HashMap();
		void add(Section section, Grade grade) {
			map.put(section,grade);
		}
		public String toString() {
			return map.toString();
		}
	}

	@Override
	public String getName() {
		return name;
	}

	

}
