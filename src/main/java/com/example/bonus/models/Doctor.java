package com.example.bonus.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor implements Serializable {

    @EmbeddedId
    private DoctorPK doctorPK;

    @Column(length = 20)
    private String degree;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "specializePK.doctor", fetch = FetchType.LAZY)
    List<Specialize> specializes = new ArrayList<>();

    public Doctor() {
    }

    public Doctor(DoctorPK doctorPK, String degree, List<Specialize> specializes) {
        this.doctorPK = doctorPK;
        this.degree = degree;
        this.specializes = specializes;
    }

    public DoctorPK getDoctorPK() {
        return doctorPK;
    }

    public void setDoctorPK(DoctorPK doctorPK) {
        this.doctorPK = doctorPK;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public List<Specialize> getSpecializes() {
        return specializes;
    }

    public void setSpecializes(List<Specialize> specializes) {
        this.specializes = specializes;
    }
}
