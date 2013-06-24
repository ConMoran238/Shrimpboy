package rtype;



public class Topscore {
 public int  Topscore= 1; 
	
	public void changescore(int Topscore, int Score) {
		if(Score > Topscore) {
			Topscore = Score;
			String msg = "New Topscore!!!!!! :" + Topscore;
		}
		
		else {
			String msg = "Topscore :" + Topscore+"" +"Your Score :" +Score ;
		}
	}
}
