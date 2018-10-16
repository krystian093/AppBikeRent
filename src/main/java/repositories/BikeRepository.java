package repositories;

import model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

interface BikeRepository extends JpaRepository<Bike, Long> {
}
