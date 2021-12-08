package com.example.bonus.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "disease")
public class Disease {

    @Id
    @Column(name = "disease_code")
    private String diseaseCode;

    @Column(name = "pathogen")
    private String pathogen;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "disease_type_id")
    DiseaseType diseaseType;

    @OneToMany(mappedBy = "discoverPK.disease", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Discover> discovers = new ArrayList<>();

    public Disease() {
    }

    public Disease(String diseaseCode, String pathogen, String description, DiseaseType diseaseType) {
        this.diseaseCode = diseaseCode;
        this.pathogen = pathogen;
        this.description = description;
        this.diseaseType = diseaseType;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    public String getPathogen() {
        return pathogen;
    }

    public void setPathogen(String pathogen) {
        this.pathogen = pathogen;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DiseaseType getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(DiseaseType diseaseType) {
        this.diseaseType = diseaseType;
    }
}
