package util;

/**
 * 콘솔과 관련한 메소드 유틸리티
 */
public final class ConsoleUtil
{
	public static final String BOLD = "\u001B[1m";
	
	public static final String RESET = "\u001B[0m";
	
	public static final String TXT_BLACK = "\u001B[90m";
	public static final String TXT_RED = "\u001B[91m";
	public static final String TXT_GREEN = "\u001B[92m";
	public static final String TXT_YELLOW = "\u001B[93m";
	public static final String TXT_BLUE = "\u001B[94m";
	public static final String TXT_WHITE = "\u001B[97m";
	
	public static final String BG_BLACK = "\u001B[100m";
	public static final String BG_RED = "\u001B[101m";
	public static final String BG_GREEN = "\u001B[102m";
	public static final String BG_YELLOW = "\u001B[103m";
	public static final String BG_BLUE = "\u001B[104m";
	public static final String BG_WHITE = "\u001B[107m";
	
	private ConsoleUtil()
	{
		System.out.println("이 클래스는 유틸리티 클래스입니다. 인스턴스 생성이 불가능합니다.");
	}
	
	/*
	 * 콘솔 창을 비우는 메소드
	 */
	public static void clear()
	{
		System.out.println("\033[H\033[2J\033[3J");
	}
}
