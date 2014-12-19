package ftc.base;

import java.util.List;

import ftc.base.compete.Competition;
import ftc.base.team.Team;

/*
 * Challenge class describes the yearly challenge
 */
public abstract class Challenge {
	public String name; //Name of challenge
	public List<Competition> listCmptns; // List of competitions
	public List<Team> listTeams; // List of teams competed
}
