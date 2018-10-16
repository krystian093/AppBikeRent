package repositories;

import model.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

interface RentRepository extends JpaRepository<Rent, Long> {
}
