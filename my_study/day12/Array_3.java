package day12;

public class Array_3 {
	public static void main(String[] args) {
			int []students= {100,95,90,88,93};
			int sum=0;
			for(int i=0;i<students.length;i++) {
				sum+=students[i];				
			}
			//����/����=����, �Ǽ����� ��������, ����/(float)�Ǽ�
			System.out.println("���� ������ ���:"+sum/(float)students.length);
	}

}
