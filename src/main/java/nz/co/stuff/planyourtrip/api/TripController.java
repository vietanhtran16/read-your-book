package nz.co.stuff.planyourtrip.api;

import nz.co.stuff.planyourtrip.domain.Trip;
import nz.co.stuff.planyourtrip.persistence.TripRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1/trips")
public class TripController {
    private static final Logger LOG = LoggerFactory.getLogger(TripController.class);
    private final TripRepository tripRepository;

    public TripController(TripRepository tripRepository) {
        LOG.info("TripController created");
        this.tripRepository = tripRepository;
    }

    @GetMapping
    public List<Trip> getAllTrips() {
        return tripRepository.getAllTrips();
    }

    @GetMapping("/{id}")
    public Trip getTripById(@PathVariable("id") long id) {
        return tripRepository.getTripById(id);
    }
}
