package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
    	if (year<1 || month<1 || month>12) {
    		System.out.println("invalid date");
    	}
    	else if(month==2) {
    		System.out.println(year%4==0 && (year%400==0 || year%100!=0)? 29:28);
    	}
    	else if((month%2!=0 && month<8) || (month>=8 &&month%2==0)) {
    		System.out.println(31);
    	}else if((month%2==0 && month<8) || (month>=8 &&month%2!=0)) {
    		System.out.println(30);
    	}else {
    		System.out.println();
    	}
    }
}
