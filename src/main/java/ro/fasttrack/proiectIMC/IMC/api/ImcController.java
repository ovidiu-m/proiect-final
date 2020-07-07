package ro.fasttrack.proiectIMC.IMC.api;
import org.springframework.web.bind.annotation.*;
import ro.fasttrack.proiectIMC.IMC.domain.Imc;
import ro.fasttrack.proiectIMC.IMC.service.ImcService;

@RestController
@RequestMapping("api/imcs")
public class ImcController {
    private final ImcService imcService;

public ImcController(final ImcService imcService) {
    this.imcService = imcService;
}

    @PostMapping
    Imc addImc(@RequestBody Imc newImc){
        return imcService.addImc(newImc);
    }
    @PutMapping("{id}")
    Imc replaceImc(@PathVariable int id, @RequestBody Imc imc) {
        return imcService.replaceImc(id, imc);
    }
    @DeleteMapping("{id}")
    Imc deleteImc(@PathVariable int id){
    return imcService.deleteImc(id);
    }
}
