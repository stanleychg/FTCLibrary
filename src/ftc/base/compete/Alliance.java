package ftc.base.compete;

import ftc.base.team.Team;

public abstract class Alliance {
	Color color; //Alliance color
	Team team1; //Captain
	Team team2; //First alliance pick
	Team team3; //Second alliance pick (Optional)
	int pointTotal; //Total points
	int pointPenalty; //Points from penalties
	int pointRaw; //Points from game-play (without penalties)
	
}
