package nz.co.stuff.planyourtrip.persistence;

import nz.co.stuff.planyourtrip.domain.Trip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Repository
public class InMemoryTripRepository implements TripRepository {
    private static final Logger LOG = LoggerFactory.getLogger(InMemoryTripRepository.class);

    public InMemoryTripRepository() {
        LOG.info("InMemoryTripRepository created");
    }
    private static final List<Trip> TRIPS = Arrays.asList(
        new Trip(1, "Bangkok", LocalDate.now()),
        new Trip(2, "Sydney", LocalDate.now()),
        new Trip(3, "Amsterdam", LocalDate.now())
    );

    @Override
    public List<Trip> getAllTrips() {
        return TRIPS;
    }

    @Override
    public Trip getTripById(long id) {
        return TRIPS.stream()
            .filter(trip -> trip.getId() == id)
            .findFirst()
            .orElse(null);
    }
}
