package ftc.base.compete;

//import java.sql.Timestamp;
import java.util.List;

import ftc.base.team.Team;

public abstract class Competition {
	String name; //Name of competition
	List<Match> listQualMatch; // List of Qualifier matches
	List<Team> listTeams; //List of competing teams
//	Timestamp timeModified; //Time last modified
//	Timestamp timeCreated; //Time created
}
