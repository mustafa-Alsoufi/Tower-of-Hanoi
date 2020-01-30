
public class TowerOfHanoi {

	boolean accessed=true;
	
	public void solveHanoi(int numOfDisks, char rodFrom, char rodMid, char rodTo)
	{
		if(accessed)
		{
			System.out.println("Number of disks: " + numOfDisks+"\n");
			accessed=false;
		}
		// Base Case if only one Disk in the game
		if (numOfDisks == 1)
			System.out.println("Move Disk 1 From "+rodFrom+" To "+ rodTo+".");
		else
		{
			//Let's assume numOfDisks=3.
			solveHanoi(numOfDisks - 1 , rodFrom, rodTo, rodMid);
			System.out.println("Move Disk "+ numOfDisks + " From " + rodFrom + " To "+ rodTo);
			solveHanoi(numOfDisks -1, rodMid, rodFrom, rodTo);
		}
	}
}
