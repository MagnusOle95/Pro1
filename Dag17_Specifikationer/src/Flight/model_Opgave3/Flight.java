package Flight.model_Opgave3;

import javax.naming.Name;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * A flight with an airline between airports. 
 */
public class Flight {
    private String flightNumber;
    private String destination;
    private LocalDateTime departDate;
    private LocalDateTime arrivalDate;
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    
    /**
     * Constructor that creates a flight for an airline.
     * @param flightNumber the number of the flight
     * @param destination the destination of the flight
     */
    // TODO: implement!
    public Flight(String flightNumber, String destination){
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    /**
     * Gets the destination.
     * @return the destination or null if not set
     */
    // TODO: implement!
    public String getDestination(){
        return this.destination;
    }
    
    /**
     * Gets the flight number.
     * @return the flight number
     */
    // TODO: implement!
    public String getFlightNumber(){
        return this.flightNumber;
    }
    
    /**
     * Gets the LocalDateTime when the flight will depart
     * @return departure date, can be null
     */
    // TODO: implement!
    public LocalDateTime getDepartDate(){
        return this.departDate;
    }

    /**
     * Sets the LocalDateTime when the flight will depart.
     * Precondition: cannot be later than the land time.
     * @param departDate
     */
    public void setDepartDate(LocalDateTime departDate) {
        this.departDate = departDate;
    }

    /**
     * Gets the LocalDateTime for when the flight will land.
     * @return arrival date, can be null
     */
    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the LocalDateTime for when the flight will land.
     * Precondition: cannot be before the depart time.
     * @param landDate arrival date
     */
    // TODO: implement!
    public void setArrivalDate (LocalDateTime landDate){
        if (this.departDate.isBefore(landDate)){
            this.arrivalDate = landDate;
        }else{
            System.out.println("Could set arrivaldate, because the arrival date has to be after departure date");
        }

    }

    /**
     * Creates a passenger with name and age
     * Precondition: name is not empty or null and age >= 0.
     * @param name name of the passenger
     * @param age the age of the passenger
     * @return the newly created passenger object
     */
    // TODO: implement!
    public void createPassenger(String name, int age){
        if (name != null || name.length() != 0 || age >= 0){
            Passenger p = new Passenger(name,age );
            passengers.add(p);
        }else{
            System.out.println("Passenger Could not be created, because the age were under 0 or name was null");
        }
    }
    
    /**
     * Removes the passenger.
     * Precondition: the passenger must exists on this flight.
     * @param passenger
     */
    // TODO: implement!
     public void removePassenger(String passenger){
         for (int i = 0; i < passengers.size(); i++){
             if (passenger.equalsIgnoreCase(passengers.get(i).getName())){
                 System.out.println("Personen " + passengers.get(i).getName() + " er fjernet fra flyet");
                 passengers.remove(i);
             }
         }
     }

    /**
     * Gets the current list of passengers on this flight
     * @return list of passengers
     */
    // TODO: implement!
    public String printPassengers(){
        String list = null;
        if (passengers.size() > 0){
            list = passengers.get(0).getName();
            for (int i = 1; i < passengers.size(); i++){
                list = list + " " + passengers.get(i).getName();
            }
        }
        return list;
    }
    
    /**
     * The duration of the flight measured in hours
     * Precondition: the depart and arrival dates must have been set
     * @return how many hours
     */
    public double flightDurationInHours() {
        
        // TODO: implement!
        // Hint: 
        // You can use the following to get hours between two LocalDates:
        //        ChronoUnit.HOURS.between(startDate, endDate)
        // ...and ChronoUnit.MINUTES for minutes...
        
        return 0.0;
    }
    
    /**
     * Returns true if the flight happens during midnight of the day of departure.
     * Precondition: depart and arrival dates must have been set
     * @return true if midnight is included in the flight period, otherwise false.
     */
    public boolean midnightFlight() {
        // TODO: implement!
        return false; // and don't just return false :)
    }
    
    /**
     * Gets the average age of all the passengers
     * Precondition: there must exists passengers on this flight
     * @return average age of passengers
     */
    // TODO: implement!
    
}
