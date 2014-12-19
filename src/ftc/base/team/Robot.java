package ftc.base.team;
/*
 * Robot class contains details for robot stats and comments
 */

import java.util.List;

public abstract class Robot {
	Drivetrain dt; //Drivetrain of robot
	GameStrategy gs; //Inclination towards offense, defense, or both
	Weight weight; //Apparent weight of robot
	int avgPoints; //Average points scored per match
	int numAutoCodes; //Number of autonomous programs
	List<String> review; //List of comments
	
}
