import java.util.*;
import java.time.*;
import java.text.*;

public class Program09 {
	
	public static void getNameOfTheDay() {
		
		YearMonth ym = YearMonth.of(2022, 3);

		String firstDay = ym.atDay(1).getDayOfWeek().name();
		String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
		System.out.println();
		System.out.println("First Day: " + firstDay);
		System.out.println("Last Day: " + lastDay);
		System.out.println();
			
	}
	
	public static void getYearAndMonths() {
		
		LocalDate bday = LocalDate.of(2000, Month.DECEMBER, 12); 
		LocalDate today = LocalDate.now(); Period age = Period.between(bday, today); 
		int years = age.getYears(); 
		int months = age.getMonths(); 
		System.out.println("number of years: " + years); 
		System.out.println("number of months: " + months);

	}
	
	
	public static void main (String []args){

		getNameOfTheDay();
		getYearAndMonths();
	 
    }
}