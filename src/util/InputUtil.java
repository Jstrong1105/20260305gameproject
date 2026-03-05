package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입력을 처리하는 유틸리티
 */
public final class InputUtil
{
	private static final String EXIT_CODE = "exit";
	
	private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	
	private InputUtil() 
	{
		System.out.println("이 클래스는 유틸리티 클래스입니다. 인스턴스 생성이 불가능합니다.");
	}
	
	/*
	 * 사용자한테 안내 메시지를 출력하고 문자를 입력받는 메소드 
	 * 탈출 코드를 입력하면 프로그램을 강제 종료 한다.
	 */
	public static String readString(String prompt) 
	{
		try
		{
			System.out.print(prompt + " : ");
			String str = BR.readLine();
			
			if(str == null)
			{
				System.out.println("잘못된 입력입니다.");
				return "";
			}
			
			str = str.trim();
			
			if(str.equalsIgnoreCase(EXIT_CODE))
			{
				System.exit(0);
				return "";
			}
			else
			{
				return str;
			}
		} 
		catch (IOException e)
		{
			throw new RuntimeException("입출력 스트림 에러 발생",e);
		}
	}
	
	/*
	 * 사용자한테 안내 메시지를 출력하고 숫자를 입력받는 메소드
	 * 숫자를 입력받을 때까지 무한히 시도한다.
	 */
	public static int readInt(String prompt)
	{
		while(true)
		{
			try
			{
				return Integer.parseInt(readString(prompt));
			} 
			catch (NumberFormatException e)
			{
				System.out.println("숫자만 입력해주세요.");
			}
		}
	}
	
	/*
	 * 사용자한테 안내 메시지를 출력하고 숫자를 제한된 범위 내에서 입력받는 메소드
	 */
	public static int readInt(String prompt,int min, int max)
	{
		while(true)
		{
			int number = readInt(String.format(prompt + " (%d~%d)", min,max));
			
			if(number < min || number > max)
			{
				System.out.println(String.format("%d~%d 사이로 입력해주세요.", min,max));
			}
			
			else
			{
				return number;
			}
		}
	}
	
	/*
	 * 사용자한테 안내 메시지를 출력하고 boolean 을 받는 메소드
	 * 대소문자를 구분하지 않는다. 
	 */
	public static boolean readBool(String prompt,String y, String n)
	{
		while(true)
		{
			String answer = readString(String.format(prompt + " (%s/%s)", y,n));
			
			if(answer.equalsIgnoreCase(y))
			{
				return true;
			}
			else if(answer.equalsIgnoreCase(n))
			{
				return false;
			}
			else
			{
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	/*
	 * 사용자한테 안내 메시지를 출력하고 엔터를 누를 때까지 대기하는 메소드
	 */
	public static void pause(String prompt)
	{
		System.out.println(prompt);
		
		try
		{
			BR.readLine();
		}
		catch (IOException e)
		{
			throw new RuntimeException("입출력 스트림 에러 발생",e);
		}
	}
}





























