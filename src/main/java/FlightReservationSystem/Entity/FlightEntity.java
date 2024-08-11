package FlightReservationSystem.Entity;

import lombok.Data;

@Data
public class FlightEntity {
    private String flightNumber;
    private String departureTime;
    private String arrivalTime;
}
