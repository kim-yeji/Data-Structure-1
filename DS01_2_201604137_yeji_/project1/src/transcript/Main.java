package transcript;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String name;	//성명
		boolean male;	//성별
		int yob;		//생년월일
		String secId;	//과목명
		String grade;	//성적
		int secNum;	    //과목수
		
		//-------- 학생 입력 ---------//
		System.out.print("이름:");
		name = scan.next();
		System.out.print("성별:");
		male = scan.nextBoolean();
		System.out.print("생년월일:");
		yob = scan.nextInt();
		
		MyStudent std = new MyStudent(name,male,yob);
		
		//-------- 과목&성적 입력 ---------//
		System.out.print("과목 수:");
		secNum = scan.nextInt();
		for(int i=0;i<secNum;i++) {
			System.out.print("과목 명:");
			MySection ms = new MySection(scan.next());
			System.out.println("성적:");
			MyGrade mg = new MyGrade(scan.next());
			std.updateTranscript(ms, mg);
			
		}
		std.printTranscript();
	
	}

}
