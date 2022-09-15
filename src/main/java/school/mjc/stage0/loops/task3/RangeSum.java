package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
	int result = 0;
	    if(firstBoarder == secondBoarder){
		System.out.println(firstBoarder);
	} else if((-1 * firstBoarder) == secondBoarder){
		System.out.println(0);
	} else{
		while(firstBoarder <= secondBoarder){
			result += firstBoarder;
			firstBoarder++;
		}
		System.out.println(result);
	}
    }
}
