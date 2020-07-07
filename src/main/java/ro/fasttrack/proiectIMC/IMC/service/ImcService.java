package ro.fasttrack.proiectIMC.IMC.service;

import org.springframework.stereotype.Service;
import ro.fasttrack.proiectIMC.IMC.domain.Imc;
import ro.fasttrack.proiectIMC.IMC.repository.ImcRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ImcService {
    private final ImcRepository imcRepository;

    public ImcService(final ImcRepository imcRepository) {
        this.imcRepository = imcRepository;
    }

    public List<Imc> getAll() {
        return imcRepository.findAll();
    }

    public Optional<Imc> getImc(final Integer id) {
        return imcRepository.findById(id);
    }

    public Imc getImcOrThrow(final Integer id) {
        return imcRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Could not find imc with id" + id));
    }

    public Imc addImc(Imc newImc) {
        return imcRepository.save(newImc);
    }

    public Imc deleteImc(int id) {
        Imc imc = getImcOrThrow(id);
        imcRepository.deleteById(id);
        return imc;
    }
    public Imc replaceImc(int id, Imc imc) {
        imc.setId(id);
        return imcRepository.save(imc);
    }
}
