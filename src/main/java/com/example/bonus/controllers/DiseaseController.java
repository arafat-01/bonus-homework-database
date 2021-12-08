package com.example.bonus.controllers;

import com.example.bonus.models.Disease;
import com.example.bonus.models.DiseaseType;
import com.example.bonus.models.Recordd;
import com.example.bonus.repo.DiseaseRepository;
import com.example.bonus.repo.DiseaseTypeRepository;
import com.example.bonus.services.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DiseaseController {

    private final DiseaseService diseaseService;

    public DiseaseController(DiseaseService diseaseService) {
        this.diseaseService = diseaseService;
    }

    @Autowired
    private DiseaseTypeRepository diseaseTypeRepository;

    @GetMapping("/disease")
    public String getDiseases(Model model) {
        List<Disease> foundDiseases = diseaseService.getDiseases();
        model.addAttribute("diseases", foundDiseases);
        return "diseases";
    }

    @GetMapping("/disease/{diseaseCode}")
    public String getDisease(@PathVariable("diseaseCode") String diseaseCode, Model model) {
        Disease foundDisease = diseaseService.getDiseaseByDiseaseCode(diseaseCode);
        List<Recordd> foundRecord = diseaseService.getRecordByDiseaseCode(diseaseCode);
        model.addAttribute("record", foundRecord);
        model.addAttribute("disease", foundDisease);
        return "disease-page";
    }

    @GetMapping("disease/create")
    public String addNewDiseasePage(Model model) {
        List<DiseaseType> diseaseTypes = diseaseTypeRepository.findAll();
        model.addAttribute("diseaseTypes", diseaseTypes);
        return "disease-create";
    }

    @PostMapping("/disease/create")
    public String addNewDisease(@RequestParam String diseaseCode, @RequestParam String pathogen,
                                @RequestParam String description, @RequestParam String diseaseType) {
        DiseaseType newDiseaseType = diseaseTypeRepository.getById(Long.valueOf(diseaseType));
        Disease newDisease = new Disease(diseaseCode, pathogen, description, newDiseaseType);
        diseaseService.addDisease(newDisease);
        return "redirect:/disease";
    }

    @GetMapping("/disease/{diseaseCode}/delete")
    public String deleteDisease(@PathVariable("diseaseCode") String diseaseCode, Model model) {
        diseaseService.deleteDisease(diseaseCode);
        return "redirect:/disease";
    }

    @GetMapping("disease/{diseaseCode}/edit")
    public String editDisease(@PathVariable("diseaseCode") String diseaseCode, Model model) {
        Disease foundDisease = diseaseService.getDiseaseByDiseaseCode(diseaseCode);
        List<DiseaseType> diseaseTypes = diseaseTypeRepository.findAll();
        model.addAttribute("diseaseTypes", diseaseTypes);
        model.addAttribute("disease", foundDisease);
        return "disease-edit";
    }

    @Autowired
    private DiseaseRepository diseaseRepository;

    @PostMapping("disease/edit")
    public String editDisease(@RequestParam String diseaseCode, @RequestParam String pathogen,
                              @RequestParam String description, @RequestParam String diseaseType, Model model) {
        Disease foundDisease = diseaseService.getDiseaseByDiseaseCode(diseaseCode);
        foundDisease.setPathogen(pathogen);
        foundDisease.setDescription(description);

        DiseaseType newDiseaseType = diseaseTypeRepository.getById(Long.valueOf(diseaseType));
        foundDisease.setDiseaseType(newDiseaseType);

        diseaseRepository.save(foundDisease);
        return "redirect:/disease";
    }
}
