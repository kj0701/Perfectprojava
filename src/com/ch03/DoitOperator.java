package com.ch03;

public class DoitOperator {
	
	public static void main(String[] args) {
		
		//n ��° ��Ʈ���� �ǳ��� ��ġ�Ϸ��� n - 1 ��Ʈ�� shift
		// �ǳ� ��Ʈ�� ������ ������ ��Ʈ�� 1�� and �����ϰ� �Ǹ�
		// �� ���� ���� �� �ִ�.
		int su = 27890;
		System.out.println("�����ʿ��� 8��° ��Ʈ : " + ((su >> 7) &1));
		
		System.out.println("�����ʿ��� 9��° ��Ʈ :" + ((su >> 8) & 1));
		
	}

}
