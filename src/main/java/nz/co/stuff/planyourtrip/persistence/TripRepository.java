package nz.co.stuff.planyourtrip.persistence;

import nz.co.stuff.planyourtrip.domain.Trip;
import java.util.List;

public interface TripRepository {
    List<Trip> getAllTrips();
    Trip getTripById(long id);
}
