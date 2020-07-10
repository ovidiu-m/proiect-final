package ro.fasttrack.proiectIMC.IMC.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ro.fasttrack.proiectIMC.IMC.domain.Imc;
import ro.fasttrack.proiectIMC.IMC.service.ImcService;
import ro.fasttrack.proiectIMC.IMC.service.VerdictService;

import java.util.Optional;

@Controller
public class ImcUiController {
    private final ImcService imcService;

    private final VerdictService verdictService;

    public ImcUiController(final ImcService imcService, final VerdictService verdictService) {
        this.imcService = imcService;
        this.verdictService = verdictService;
    }
    @GetMapping
    public String rootPage() {
        return "redirect:/imcs";
    }

    @GetMapping("imcs")
    public String imcsPage(Model pageModel) {
      pageModel.addAttribute("imcs", imcService.getAll());
        return "imcs";
    }
   @GetMapping("imcs/{id}")
   public String imcsPageEithDetails(@PathVariable Integer id, Model pageModel){
       Optional<Imc> imc = imcService.getImc(id);
       if(imc.isPresent()) {
           pageModel.addAttribute("showDetails",true);
           pageModel.addAttribute("selectedImc", imc.get());
           pageModel.addAttribute("verdict", verdictService.getVerdict(imc.get()));
           return imcsPage(pageModel);
       }else {
           return "redirect:/imcs";
       }
    }
}