import java.util.Scanner;
public class Ex_if {

	public static void main(String[] args) {
		//����ڷκ��� ����, ����, ���� ������ �Է� �޾�, �� ���� ������ ��� �̻����� �������� ���غ���
		Scanner sc = new Scanner(System.in);
		
		/**
		Scanner ��ü���� ��, ����, ����, ���� ������ �Է¹��� 
		 **/
		
		System.out.println("���� ������ �Է��ϼ���.");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		int math = sc.nextInt();
		
		int sum = 0; // �հ� ���� �ʱⰪ
		int avg = ( kor + eng + math ) / 3; // �� ������ ��� ���ϱ�
		
		// �Ʒ� ��� ������ %d �� printf �޼ҵ� ��� �������� c���� ���� �մϴ�. 
		// �𸣽ø� google -> java �������� �˻� 
		System.out.printf("���������� %d�� , ���� ������ %d�� , ���� ������ %d��, �������� ����� %d �� �Դϴ�. %n", kor, eng, math, avg);
		
		// �Ʒ� ������ �⺻ ���ǹ��� Ȱ���� �����Ǻ��Դϴ�.
		// ���� ���� �Ǵ� 
		if (kor > avg) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		}else if(kor <avg) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		}else {
			System.out.println("���� ������ ����Դϴ�.");
		}
		//���� ���� �Ǵ�
		if (eng > avg) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		}else if(eng <avg) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		}else {
			System.out.println("���� ������ ����Դϴ�.");
		}
		//���� ���� �Ǵ� 
		if (math > avg) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		}else if(math <avg) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		}else {
			System.out.println("���� ������ ����Դϴ�.");
		}
	}
}
