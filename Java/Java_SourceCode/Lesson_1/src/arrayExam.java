import java.util.Scanner;

public class arrayExam {
	public static void main(String[] args) {

		String[] Student = { "ö��", "����", "�ض�", "����", "����" };
		int[] StuHeight = new int[5];
		int avgH = 0;
		int maxH = 0;
		int maxHIndex =0; int minH =0; int minHIndex = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("�� �л����� Ű�� �Է��ϼ���.");
		for (int i = 0; i < Student.length; i++) {
			System.out.println(Student[i]);
			StuHeight[i] = scan.nextInt();
			avgH += StuHeight[i];
		}
		// Ű�� ���� ū �л� ���
		for (int i = 0; i < Student.length; i++) {
			if(StuHeight[i] > maxH) {
				maxH = StuHeight[i];
				maxHIndex = i ;
			}
		}
		
		// Ű�� ���� ���� �л� ���
		for (int i = 0; i < Student.length; i++) {
			minH= maxH;
			if(StuHeight[i]<minH) {
				minH=StuHeight[i];
				minHIndex = i;
			}
		}
		// �л��� Ű ���
		for (int i = 0; i < Student.length; i++) {
			System.out.print(Student[i] + "=" + StuHeight[i] + "\t");
		}
		System.out.println();
		System.out.printf("Ű�� ���� ū �л��� %s �̰�, Ű�� %d �Դϴ�. \n" ,Student[maxHIndex], StuHeight[maxHIndex]);
		System.out.printf("Ű�� ���� ���� �л��� %s �̰�, Ű�� %d �Դϴ�." ,Student[minHIndex], StuHeight[minHIndex]);
		System.out.println("cherwoo.tistory.com ��α� �ּ��Դϴ�.");
	}

}
