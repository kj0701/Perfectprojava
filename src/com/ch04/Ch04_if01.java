package com.ch04;

import java.io.IOException;

// 한 문자를 입력받아 대문자인지, 소문자 인지를 판별하고 그 외에는 
// 영문자가 아닙니다를 출력해보자.

public class Ch04_if01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;  // 1. 스트림  2. Scanner 3. 표준 입력 
		System.out.println("한문자를 입력하세요");
		ch = (char)System.in.read();
	
		if( ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자 입니다.");
		}else if( ch >= 'a' && ch <= 'z'){
			System.out.println("대문자 입니다.");
		}else {
			System.out.println("영문자가 아닙니다.");
		}
		
		
	}

}
