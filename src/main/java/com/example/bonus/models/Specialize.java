package com.example.bonus.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "specialize")
public class Specialize implements Serializable {

    @EmbeddedId
    private SpecializePK specializePK;

    public Specialize() {
    }

    public Specialize(SpecializePK specializePK) {
        this.specializePK = specializePK;
    }

    public SpecializePK getSpecializePK() {
        return specializePK;
    }

    public void setSpecializePK(SpecializePK specializePK) {
        this.specializePK = specializePK;
    }
}
