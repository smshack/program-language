package lecture22.calendare;

import java.util.Calendar;

public class MainClass {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		System.out.println();

		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		System.out.println();

		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		System.out.println(System.currentTimeMillis());

		//String와 StringBuilder의 성능 차이 비교
		String str = "A";	
		long startNum = System.currentTimeMillis();// 시작 시간 저장

		for (int i = 0; i < 50000; i++) {
			str = str + "A";	//반복으로 A를 계속 더함
		}

		long endNum = System.currentTimeMillis();	//끝나는 시간을 저장
		System.out.println("경과 시간" + (endNum - startNum));//경과 시간=시작시간 - 끝나는 시간
		
		StringBuilder stringBuilder = new StringBuilder("A");
		long startNum1 = System.currentTimeMillis();

		for (int i = 0; i < 50000; i++) {
			stringBuilder = stringBuilder.append("A");
		}

		long endNum1 = System.currentTimeMillis();
		System.out.println("경과 시간" + (endNum1 - startNum1));
		System.out.println("---------------------------------------------------------------");
		
		
		
		
		
		
	}
}
