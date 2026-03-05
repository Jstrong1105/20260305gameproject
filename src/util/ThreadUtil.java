package util;

/**
 * Thread 관련 유틸리티
 */
public final class ThreadUtil
{
	private ThreadUtil()
	{
		System.out.println("이 클래스는 유틸리티 클래스입니다. 인스턴스 생성이 불가능합니다.");
	}
	
	/*
	 * 입력받은 초 만큼 정지 하는 메소드
	 */
	public static void sleepSecond(int second)
	{
		if(second < 0)
		{
			throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
		}
		
		try
		{
			Thread.sleep(1000L * second);
		}
		catch(InterruptedException e)
		{
			 Thread.currentThread().interrupt();
		}
	}
	
	/*
	 * 입력받은 초 만큼 정지 하면서 남은 시간을 출력해주는 메소드
	 */
	public static void sleepSecondCount(int second)
	{
		if(second < 0)
		{
			throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
		}
		
		for(int i = second; i > 0; i++)
		{
			System.out.printf("\r%d초 남았습니다.",i);
			
			sleepSecond(1);
		}
	}
}
