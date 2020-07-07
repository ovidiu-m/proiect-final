package ro.fasttrack.proiectIMC.IMC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrack.proiectIMC.IMC.domain.Imc;

public interface ImcRepository extends JpaRepository<Imc, Integer> {
}
