package ro.fasttrack.proiectIMC.IMC;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrack.proiectIMC.IMC.domain.Imc;
import ro.fasttrack.proiectIMC.IMC.repository.ImcRepository;

import java.util.List;

@SpringBootApplication
public class ProiectImcImcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProiectImcImcApplication.class, args);
    }

    @Bean
    CommandLineRunner atStartup(ImcRepository repo) {
		return args -> repo.saveAll(List.of(
					new Imc("Ana", 160, 60, 23),
					new Imc("Mihai", 190, 80, 22),
					new Imc("George", 170, 70, 24),
                    new Imc("Andrei",180,80,25)
			));
		}
    }
