package byuljin.calendar;

import java.util.Scanner;

public class Prompt {
	private final static String YEAR_PROMPT = "YEAR> ";
	private final static String MONTH_PROMPT = "MONTH> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		while (true) {
			System.out.println("Year를 입력하세요");
			System.out.print(YEAR_PROMPT);
			int year = scanner.nextInt();
			System.out.println("Month를 입력하세요");
			System.out.print(MONTH_PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}

			if (month > 12) {
				continue;
			}
			cal.printCalendar(year, month);
		}

		scanner.close();
	}

}
