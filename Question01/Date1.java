package Question01;

public class Date1 {
	public String month;
	public int day;
	public int year;
	// change month number (int) to string - used by setDate
	public String monthString( int monthNumber ) {
		switch ( monthNumber ) {
		case 1: return "January";
		case 2: return "February";
		case 3: return "March";
		case 4: return "April";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "September";
		case 10: return "October";
		case 11: return "November";
		case 12: return "December";
		default: return"????";
		}
	}
	public void setDate(int month, int day, int year){
		this.month = monthString( month );
		this.day = day;
		this.year =	year;
	}
	public String toString() {
		return month + " " + day +	", " + year;
	}
	public static void main(String[] args) {
		Date1 newYears = new Date1();
		newYears.month = "January";
		newYears.day = 1;
		newYears.year = 2011;
		Date1 birthday = new Date1();
		birthday.month = "July";
		birthday.day = 4;
		birthday .year = 1776;
		System.out.println(newYears.toString());
		System.out.println (birthday.toString());
		System.out.println (birthday.monthString(6));
		birthday.setDate ( 2, 2, 2002);
		System.out.println(birthday.toString());
		newYears.day = 42;
		System.out.println(newYears.toString());
	}
}