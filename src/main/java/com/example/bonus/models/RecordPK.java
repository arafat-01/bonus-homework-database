package com.example.bonus.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RecordPK implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "disease_code")
    private Disease disease;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cname")
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "email")
    private PublicServant publicServant;


    public RecordPK() {
    }

    public RecordPK(Disease disease, Country country, PublicServant publicServant) {
        this.disease = disease;
        this.country = country;
        this.publicServant = publicServant;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public PublicServant getPublicServant() {
        return publicServant;
    }

    public void setPublicServant(PublicServant publicServant) {
        this.publicServant = publicServant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordPK that = (RecordPK) o;
        return country.equals(that.country) && disease.equals(that.disease) && publicServant.equals(that.publicServant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, disease, publicServant);
    }
}
