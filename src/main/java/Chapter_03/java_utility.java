package Chapter_03;


import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class java_utility
{
	public int generateRandomNum(int limit)
	{
		Random random =new Random();
		return random.nextInt();
	}
	
	public String getCurrentTime()
	{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_mm_yyyy_hh_mm_sss");
		return sdf.format(date);
	}
public int convertMonthToInt(String month)
{
	return DateTimeFormatter
			.ofPattern("MMMM")
			.withLocale(Locale.ENGLISH)
			.parse(month)
			.get(ChronoField.MONTH_OF_YEAR);
			
}
}
