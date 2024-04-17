
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
        city.setWeight("Bob's Bakery", "Cammy's Chamomile", "Linda's Lane", 2);
        
        city.add("Cammy's Chamomile");
        city.setWeight("Cammy's Chamomile", "Tia's Tropicana", "Sol's Street", 7);
        city.setWeight("Cammy's Chamomile", "Indy's Ice Cream", "Arnold's Avenue", 3);
        city.setWeight("Cammy's Chamomile", "Bob's Bakery", "Linda's Avenue", 2);

        city.add("Indy's Ice Cream");
        city.setWeight("Indy's Ice Cream", "Crystal Catering", "New Street", 7); //new change
        city.setWeight("Indy's Ice Cream", "Cammy's Chamomile", "Arnold's Avenue", 3);//new change
        city.setWeight("Indy's Ice Cream", "Dobby's Drycleaner", "Krish's Blvd", 5);//new change

        city.add("Dobby's Drycleaner");
        city.setWeight("Dobby's Drycleaner", "Indy's Ice Cream", "Krish's Blvd", 5)//new change
        city.setWeight("Dobby's Drycleaner", "Brennen's BBLs", "Letter Street", 7);//new change
 
        city.add("Laasya's Laundromat");
        city.setWeight("Laasya's Laundromat", "Bob's Bakery", "Cindy's Street", 5);//new change
        city.setWeight("Laasya's Laundromat", "Tia's Tropicana", "Best Avenue", 3);//new change
        city.setWeight("Laasya's Laundromat", "Juan's Sushi Bar", "Old Street", 2);//new change

        city.add("Tia's Tropicana");
        city.setWeight("Tia's Tropicana", "Lassya's Laundromat", "Best Avenue", 3);//new change
        city.setWeight("Tia's Tropicana", "Bud's Bowling", "Contemporary Street", 5);//new change
        city.setWeight("Tia's Tropicana", "Crystal's Catering", "Modern Avenue", 2);//new change
        city.setWeight("Tia's Tropicana", "Cammy's Chamomile", "Sol's Street", 7);//new change


        city.add("Crystal's Catering");
        city.setWeight("Crystal's Catering", "Tia's Tropicana", "Modern Avenue", 2);//new change
        city.setWeight("Crystal's Catering", "Freddy's Freestyle Karaoke", "English Street", 3);//new change
        city.setWeight("Crystal's Catering", "Brennan's BBLs", "White Avenue", 2);//new change
        city.setWeight("Crystal's Catering", "Indy's Ice Cream", "New Street", 7);//new change

        city.add("Brennan's BBLs");
        city.setWeight("Brennan's BBLs", "Crystal's Catering", "White Avenue", 2)//new change
        city.setWeight("Brennan's BBLs", "Simon's Seashells & Other Exoctic Items", "Gray Street", 5);//new change
        city.setWeight("Brennan's BBLs", "Dobby's Drycleaner", "Letter Street", 7);//new change

        city.add("Juan's Sushi Bar");
        city.setWeight("Juan's Sushi Bar", "Buds Bowling", "Future Avenue", 7);//new change
        city.setWeight("Juan's Sushi Bar", "Laasya's Laundromat", "Old Street", 2);//new change

        city.add("Bud's Bowling");
        city.setWeight("Bud's Bowling", "Juan's Sushi Bar", "Future Avenue", 7);
        city.setWeight("Bud's Bowling", "Freddy's Freestyle Karaoke", "Medieval Avenue", 5);
        city.setWeight("Bud's Bowling", "Tia's Tropicana", "Contemporary Street", 5);

        city.add("Freddy's Freestyle Karaoke");
        city.setWeight("Freddy's Freestyle Karaoke", "Bud's Bowling", "Medieval Avenue", 5);//boulevard
        city.setWeight("Freddy's Freestyle Karaoke", "Simon's Seashells & Other Exoctic Items", "City Boulevard", 3);
        city.setWeight("Freddy's Freestyle Karaoke", "Crystal's Catering", "English Street", 3);

        city.add("Simon's Seashells & Other Exoctic Items");
        city.setWeight("Simon's Seashells & Other Exoctic Items", "Freddy's Freestyle Karaoke", "City Boulevard", 3);
        city.setWeight("Simon's Seashells & Other Exoctic Items", "Brennan's BBLs", "Gray Street", 5);
        // initialise instance variables
    }
}
