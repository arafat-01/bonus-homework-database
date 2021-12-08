package com.example.bonus.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SpecializePK implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "disease_type_id")
    private DiseaseType diseaseType;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor_email")
    private Doctor doctor;

    public SpecializePK() {
    }

    public SpecializePK(DiseaseType diseaseType, Doctor doctor) {
        this.diseaseType = diseaseType;
        this.doctor = doctor;
    }

    public DiseaseType getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(DiseaseType diseaseType) {
        this.diseaseType = diseaseType;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecializePK that = (SpecializePK) o;
        return diseaseType.equals(that.diseaseType) && doctor.equals(that.doctor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diseaseType, doctor);
    }
}
