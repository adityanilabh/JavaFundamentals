package Generics.WildCardsAndUnbounded.UpperBound.CodingProblemOne;

import java.util.List;

public class Team<T extends Number> {
    private List<Player<T>>  players;
    public Team(List<Player<T>>players)
    {
        this.players= players;
    }
    
    public double calculateTotalSkills(){
        double totalSkills=0.0;

        for(Player<T>player: players)
        {
            totalSkills+=player.getSkillLevel().doubleValue();
        }
        return totalSkills;
    }
}
