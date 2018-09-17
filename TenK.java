	import java.time.*;
	public class TenK
	{
	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(2000, 4, 3);
		final int DAYS_AHEAD = 10000;
		System.out.println("I will be " + DAYS_AHEAD + " days old on " + birthday.plusDays(DAYS_AHEAD));
		}
	}