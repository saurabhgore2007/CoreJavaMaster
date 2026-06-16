package Day10;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Players
{
	public int id;
	public String playerName;
	public int innings;
	public String team;

	public Players(){}

	public Players(int id, String playerName, int innings, String team)
	{
		this.id = id;
		this.playerName = playerName;
		this.innings = innings;
		this.team = team;
	}

	@Override
	public String toString()
	{
		return String.format("%10d %20s %10d %20s", this.id, this.playerName, this.innings, this.team);
	}


	@Override
	public boolean equals(Object obj)
	{
		Players another = (Players)obj;
		if(this.id==another.id && this.playerName.equals(another.playerName) && this.innings==another.innings
				&& this.team.equals(another.team))
					return true;
		else
					return false;
	}

	@Override
	public int hashCode()
	{
		return new Integer(id).hashCode();		//191->7843			191->7843
	}
}

public class MapEx2 {

	public static void main(String[] args) {

		Map<String, Set<Players>> match = new LinkedHashMap<String, Set<Players>>();
		
		List<Players> players = Arrays.asList(
				new Players(193, "Virat", 80, "INDIA"),
				new Players(242, "Ricky", 170, "AUSTRELIA"),
				new Players(531, "Polard", 104, "ENGLAND"),
				new Players(425, "Sachin", 140, "INDIA"),
				new Players(445, "Sehwag", 130, "INDIA"),
				new Players(434, "Peter", 104, "ENGLAND"),
				new Players(414, "James", 103, "ENGLAND"),
				new Players(343, "Shreyas", 170, "INDIA"),
				new Players(445, "Sehwag", 130, "INDIA")
			);
		
		Set<String> teams = new LinkedHashSet<String>();
		
		for(Players p:players) {
			teams.add(p.team);
		}
		
		for(String team : teams) {
			match.put(team, new LinkedHashSet<Players>());
		}
		
		for(Players p : players) {
			match.get(p.team).add(p);
		}
		
		for(String team:match.keySet())
		{
			System.out.println(team);
			System.out.println("----------------------------------------------------------");
			for(Players item:match.get(team))
			{
				System.out.println(item);
			}
		}
	}
}
