public class uni1quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// computer random die number 1 trough 6
				int dieRoll = (int)(Math.random() * 6) + 1;
				
		// user random die 1	
				int userRoll = (int)(Math.random() * 6) + 1;
		
			
		
		// for loop because a set amount of times to go through (10)	
			for (int i = 0; i > 10;i++) {
				
				// computer wins
				if (dieRoll > userRoll ) {
					System.out.println ("the computer won! \n" 
							+ "The comuptures die was " + dieRoll
							+ "\nYour die was " + userRoll);

										 }
				// user wins 
				else if (dieRoll < userRoll ) {
					System.out.println ("You won! \n" 
				    + "Your die was " + userRoll 
					+ "\nThe computers die was " 
					+ dieRoll);

											  }
				// tie
				else { 
					System.out.println ("there was a tie, no winner");
					 }
				// us a do while loop to have determine the winner for 
				//how many times each payer one 	
				
				// it would not print in the console 
			}		
		
		}
			

	}



