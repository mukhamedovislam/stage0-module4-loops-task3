package school.mjc.stage0.loops.task3;
import java.lang.Math;
public class DigitsSum {
    public void printDigitsSum(int t){
	    int result = 0;
	    while(t != 0){
		    result += t % 10;
		    t /= 10;
	    }
	    System.out.println(Math.abs(result));
    }
}
