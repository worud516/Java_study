package day08;

import java.util.Random;

public class Pokemon {
	public static void main(String[] args) {
		Random random=new Random();
		System.out.println("�١ڡ١�Random Choosing Pokemon�١ڡ١�");
		System.out.println("1. ��ī��: ���Ⱬ��");
		System.out.println("2. ���α�: ������");
		System.out.println("3. �̻��ؾ�:Ǯ����");
		int mypokemon=random.nextInt(3)+1;//0~2,1~3
		System.out.println("���õȹ�ȣ:"+mypokemon);
		switch(mypokemon) {
		case 1:
			System.out.println("��ī�� ����! �鸸��Ʈ!!!!");
			break;
		case 2:
			System.out.println("���α� ����! ������!!!!");
			break;
		case 3:
			System.out.println("�̻��ؾ� ����! ����ä��!!!!!");
			break;
		
		}
		
	}

}
