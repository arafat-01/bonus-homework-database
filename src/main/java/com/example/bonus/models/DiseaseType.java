package com.example.bonus.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "disease_type")
public class DiseaseType {
    public DiseaseType() {
    }

    @Id
    @SequenceGenerator(name = "seq", sequenceName = "seq_generator", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diseaseType", fetch = FetchType.LAZY)
    List<Disease> diseases = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "specializePK.diseaseType", fetch = FetchType.LAZY)
    List<Specialize> specializes = new ArrayList<>();

    public DiseaseType(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public DiseaseType(Long id, String description, List<Disease> diseases, List<Specialize> specializes) {
        this.id = id;
        this.description = description;
        this.diseases = diseases;
        this.specializes = specializes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Disease> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<Disease> diseases) {
        this.diseases = diseases;
    }

    public List<Specialize> getSpecializes() {
        return specializes;
    }

    public void setSpecializes(List<Specialize> specializes) {
        this.specializes = specializes;
    }
}
