package com.ch04;

import java.io.IOException;

// �� ���ڸ� �Է¹޾� �빮������, �ҹ��� ������ �Ǻ��ϰ� �� �ܿ��� 
// �����ڰ� �ƴմϴٸ� ����غ���.

public class Ch04_if01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;  // 1. ��Ʈ��  2. Scanner 3. ǥ�� �Է� 
		System.out.println("�ѹ��ڸ� �Է��ϼ���");
		ch = (char)System.in.read();
	
		if( ch >= 'A' && ch <= 'Z') {
			System.out.println("�빮�� �Դϴ�.");
		}else if( ch >= 'a' && ch <= 'z'){
			System.out.println("�빮�� �Դϴ�.");
		}else {
			System.out.println("�����ڰ� �ƴմϴ�.");
		}
		
		
	}

}
