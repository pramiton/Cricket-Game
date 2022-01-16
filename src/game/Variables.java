package game;

public class Variables{
    int coin;
    boolean batting;
    boolean bowling;
    
public static void runreaction(int runsadded, int yourscore, int ballcount, int wickets) {
			switch (runsadded) {
			case 0: 
		
				yourscore = runsadded + yourscore;
				ballcount = ballcount + 1;
				System.out.println("Not bad, dot ball (No runs). Your new score is: " + yourscore + " runs, " + wickets + " wickets down, " + ballcount + " balls elapsed.");
			
			case 1: 
				
				yourscore = runsadded + yourscore;
				ballcount = ballcount + 1;
				System.out.println("Well played, 1 run. Your new score is: " + yourscore + " runs, " + wickets + " wickets down, " + ballcount + " balls elapsed.");
			
			case 2: 
				
				yourscore = runsadded + yourscore;
				ballcount = ballcount + 1;
				System.out.println("Nicely played, 2 runs. Your new score is: " + yourscore + " runs, " + wickets + " wickets down, " + ballcount + " balls elapsed.");
			
			case 3: 
				
				yourscore = runsadded + yourscore;
				ballcount = ballcount + 1;
				System.out.println("Good shot, 3 runs. Your new score is: " + yourscore + " runs, " + wickets + " wickets down, " + ballcount + " balls elapsed.");
		
			case 4:
				
				yourscore = runsadded + yourscore;
				ballcount = ballcount + 1;
				System.out.println("Great shot! Boundary, 4 runs. Your new score is: " + yourscore + " runs, " + wickets + " wickets down, " + ballcount + " balls elapsed.");
				
			case 5: 
				
				yourscore = runsadded + yourscore;
				ballcount = ballcount + 1;
				System.out.println("Wow! 5 runs. Your new score is: " + yourscore + " runs, " + wickets + " wickets down, " + ballcount + " balls elapsed.");
				
			case 6: 
				
				yourscore = runsadded + yourscore;
				ballcount = ballcount + 1;
				System.out.println("WHAT A SHOT! 6 runs, into the crowd! Your new score is: " + yourscore + " runs, " + wickets + " wickets down, " + ballcount + " balls elapsed.");
				
		}   				
			
		}}
}
