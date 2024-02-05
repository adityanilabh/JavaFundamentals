package Generics.WildCardsAndUnbounded.UpperBound.CodingProblemOne;

public class Player<T extends Number>{
    private T skillLevel;
    public Player(T skillLevel)
    {
        this.skillLevel= skillLevel;
    }
    
    public T getSkillLevel(){
        return skillLevel;
    }
    
}
