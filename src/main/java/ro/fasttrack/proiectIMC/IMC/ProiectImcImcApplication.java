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
					new Imc("Ana", 1.6, 60),
					new Imc("Mihai", 1.9, 80),
					new Imc("George", 1.7, 70),
                    new Imc("Andrei",1.8,80)
			));
		}
    }
