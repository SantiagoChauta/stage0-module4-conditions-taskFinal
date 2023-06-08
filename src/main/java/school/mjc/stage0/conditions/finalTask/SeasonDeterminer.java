package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
    	if (monthNumber==12 || monthNumber==1 || monthNumber==2) {
    		System.out.println("Winter");
    	}else if (monthNumber>2 && monthNumber<6) {
    		System.out.println("Spring");
    	}else if (monthNumber>5 && monthNumber<9) {
    		System.out.println("Summer");
    	}else if (monthNumber>8 && monthNumber<12) {
    		System.out.println("Autum");
    	}else {
    		System.out.println("Wrong month number");
    	}
    }
}
