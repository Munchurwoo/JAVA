
public class Ex_for {

	public static void main(String[] args) {
//		 - 1���� 10������ ���� ���غ���
		int sum = 0;
		for(int i=0; i<11; i++) {
			sum += i ;
		}
		System.out.println("1���� 10������ ���� : " + sum);

//		 - 1���� 10������ ���� �� ¦�� �Ǵ� Ȧ������ ���� ���غ���.
		int oddSum = 0;
		int evenSum = 0;
		for(int i =1; i<11; i++) {
			if(i%2==0) {
				oddSum += i;
			}else {
				evenSum += i;
			}
		}
		
		System.out.println("------------------------");
		System.out.printf("Ȧ���� ���� %d \n", oddSum);
		System.out.printf("¦���� ���� %d \n", evenSum);
		System.out.println("------------------------");
//		 - �������� ����� ����. * �Ʒ��� ���
		for(int i =2; i<10; i++) {
			for(int j = 1;j<10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
//		- ������ ���η� ��� 
		for(int i=1; i<10; i++) {
			System.out.println("");
			for(int j = 2; j<10; j++ ) {
				System.out.printf("%d * %d = %d \t", j,i,i*j);
			}
		}
	}
}
