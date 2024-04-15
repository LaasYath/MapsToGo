
/**
 * This is the class that represents the map/grid that will act as the city the user will traverse through.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class City
{
    // instance variables - replace the example below with your own
    private WeightedAdjacencyListGraph city;
    //test for pushing at school

    /**
     * Constructor for objects of class CityMap
     */
    public City()
    {
        city = new WeightedAdjacencyListGraph();
        // bobsMap = new HashMap();
        // bobsMap.add("r", 5);
        // bobsMap.add("b", 5);
        city.add("Bob's Bakery");
        city.setWeight("Bob's Bakery", "Laasya's Laundromat", "Cindy's Street", 5);
        city.setWeight("Bob's Bakery", "Cammy's Chamomile", "Linda's Avenue", 2);
        city.add("Cammy's Chamomile");
        city.setWeight("Cammy's Chamomile", "Tia's Tropicana", "Sol's Street", 7);
        city.setWeight("Cammy's Chamomile", "Indy's Ice Cream", "Arnold's Avenue", 3);
        city.setWeight("Cammy's Chamomile", "Bob's Bakery", "Linda's Avenue", 2);
        city.add("Indy's Ice Cream");
        city.setWeight("Cammy's Chamomile", "Tia's Tropicana", "Sol's Street", 7);
        city.setWeight("Cammy's Chamomile", "Indy's Ice Cream", "Arnold's Avenue", 3);
        city.add("Dobby's Drycleaner");
        city.add("Laasya's Laundromat");
        city.add("Tia's Tropicana");
        city.add("Crystal's Catering");
        city.add("Brennan's BBLs");
        city.add("Juan's Sushi Bar");
        city.add("Bud's Bowling");
        city.add("Freddy's Freestyle Karaoke");
        city.add("Simon's Seashells & Other Exoctic Items");
        // initialise instance variables
        
        city = null;
    }
}
