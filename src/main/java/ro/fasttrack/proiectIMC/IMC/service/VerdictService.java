package ro.fasttrack.proiectIMC.IMC.service;

import org.springframework.stereotype.Service;
import ro.fasttrack.proiectIMC.IMC.domain.Imc;
import ro.fasttrack.proiectIMC.IMC.domain.Verdict;
@Service
public class VerdictService {

    public Verdict getVerdict(Imc imc) {
        if (imc.getRezultat() > 18 && imc.getRezultat() <25) {
            return new Verdict("intre 18 si 24,99", "Greutate normala");
        }else if(imc.getRezultat() > 24.99 && imc.getRezultat() <30) {
            return new Verdict("intre 25 si 30 ","Supraponderal");
        }
        return new Verdict();
    }
}
