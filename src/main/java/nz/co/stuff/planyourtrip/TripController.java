package nz.co.stuff.planyourtrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/trips")
public class TripController {
    private static final List<Trip> TRIPS = Arrays.asList(
        new Trip(1, "Bangkok", LocalDate.now()),
        new Trip(2, "Sydney", LocalDate.now()),
        new Trip(3, "Amsterdam", LocalDate.now())
    );

    @GetMapping
    public List<Trip> getAllTrips() {
        return TRIPS;
    }

    @GetMapping("/{id}")
    public Trip getTripById(@PathVariable("id") long id) {
        for (Trip trip : TRIPS) {
            if (trip.getId() == id) {
                return trip;
            }
        }
        return null;
    }
}
