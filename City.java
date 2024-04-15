
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

    /**
     * Constructor for objects of class CityMap
     */
    public City()
    {
        // initialise instance variables
        city = null;
    }

    public void setCity(WeightedAdjacencyListGraph city){

        this.city = city;
    }

    public String findShortestRoute(String pointA, String pointB){

        String fastestRoute = "";

        if (!city.contains(pointA) || !city.contains(pointB))
            return "";

        fastestRoute += pointA;

        ArrayList<Object> neighbors = city.getNeighborWeights(pointA);

        for (Object node: neighbors){

            if (city.get(2)) {

            }
        }



        return fastestRoute;
    }
}
