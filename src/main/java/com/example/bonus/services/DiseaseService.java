package com.example.bonus.services;

import com.example.bonus.models.Disease;
import com.example.bonus.models.Recordd;
import com.example.bonus.repo.DiseaseRepository;
import com.example.bonus.repo.RecorddRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseService {

    @Autowired
    private DiseaseRepository diseaseRepository;

    @Autowired
    private RecorddRepository recorddRepository;

//    public DiseaseService(DiseaseRepository diseaseRepository) {
//        this.diseaseRepository = diseaseRepository;
//    }

    public Disease getDiseaseByDiseaseCode(String diseaseCode) {
        return diseaseRepository.findDiseaseByDiseaseCode(diseaseCode);
    }

    public List<Disease> getDiseases() {
        return diseaseRepository.findAll(Sort.by(Sort.Direction.ASC, "diseaseCode"));
    }

    public List<Recordd> getRecordByDiseaseCode(String diseaseCode) {
        Disease disease = getDiseaseByDiseaseCode(diseaseCode);
        return recorddRepository.findAllByRecordPKDisease(disease);
    }

    public void addDisease(Disease newDisease) {
        diseaseRepository.save(newDisease);
    }

    public void deleteDisease(String diseaseCode) {
        Disease disease = getDiseaseByDiseaseCode(diseaseCode);
        diseaseRepository.delete(disease);
    }

}
