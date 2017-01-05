package jacktlee.counterwatch.Utility;

import java.util.ArrayList;

/**
 * Created by Jack on 8/31/2016.
 */
public class Hero
{
    private String heroName;
    private String heroType;
    private String heroComment;
    private ArrayList weakAgainst;
    private ArrayList strongAgainst;

    public Hero(String heroType, String heroName, String heroComment)
    {
        this.heroName = heroName;
        this.heroType = heroType;
        this.heroComment = heroComment;
    }

}
