package Question07;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

public class Age {
	public static String getDayOfWeek(int year, int month, int day) {
		LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.toString();
	}
	public static void main(String args[])  {
		int birthYear = Integer.parseInt(args[0]);
		int birthMonth = Integer.parseInt(args[1]);
		int birthDay = Integer.parseInt(args[2]);
		LocalDate birthdate = LocalDate.of(birthYear, birthMonth, birthDay);  
		LocalDate currentDate = LocalDate.now();  
		Period period = Period.between(birthdate, currentDate);
		System.out.println("Your age is " + period.getYears() + " years " + period.getMonths() + " months and " + period.getDays() + " days.");  
		System.out.println("Yearwise Days of Your Birthdate :");
		for(int i = birthYear; i <= currentDate.getYear(); i++) {
			System.out.println(i + " : " + getDayOfWeek(i, birthMonth, birthDay));
		}
	}

}
