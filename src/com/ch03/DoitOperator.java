package com.ch03;

public class DoitOperator {
	
	public static void main(String[] args) {
		
		//n 번째 비트값을 맨끝에 위치하려면 n - 1 비트를 shift
		// 맨끝 비트를 제외한 나머지 비트에 1을 and 연산하게 되면
		// 그 값을 구할 수 있다.
		int su = 27890;
		System.out.println("오른쪽에서 8번째 비트 : " + ((su >> 7) &1));
		
		System.out.println("오른쪽에서 9번째 비트 :" + ((su >> 8) & 1));
		
	}

}
