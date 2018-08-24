package transcript;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String name;	//����
		boolean male;	//����
		int yob;		//�������
		String secId;	//�����
		String grade;	//����
		int secNum;	    //�����
		
		//-------- �л� �Է� ---------//
		System.out.print("�̸�:");
		name = scan.next();
		System.out.print("����:");
		male = scan.nextBoolean();
		System.out.print("�������:");
		yob = scan.nextInt();
		
		MyStudent std = new MyStudent(name,male,yob);
		
		//-------- ����&���� �Է� ---------//
		System.out.print("���� ��:");
		secNum = scan.nextInt();
		for(int i=0;i<secNum;i++) {
			System.out.print("���� ��:");
			MySection ms = new MySection(scan.next());
			System.out.println("����:");
			MyGrade mg = new MyGrade(scan.next());
			std.updateTranscript(ms, mg);
			
		}
		std.printTranscript();
	
	}

}