package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
    	String ans = firstSide+secondSide>thirdSide 
    			? secondSide + thirdSide > firstSide
    					? thirdSide+firstSide>secondSide
    							? "this is a valid triangle"
    							: "it's not a triangle"
    					: "it's not a triangle"
    			: "it's not a triangle";
    	System.out.println(ans);
    }
}
