package ftc.base.team;
/*
 * Team class stores team information, including list of robots used in
 * each competition and list of competitions participated in
 */
import java.net.URI;
import java.util.List;

import ftc.base.compete.Competition;

public class Team {
	String name; //Team name
	int num; //Team number
	URI webLink; //Team website
	String email; //Team email
	List<Robot> robots; //List of robot iterations
	List<Competition> competitions; //List of participated competitions
}
