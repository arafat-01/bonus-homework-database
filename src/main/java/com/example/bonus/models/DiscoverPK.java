package com.example.bonus.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DiscoverPK implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cname")
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "disease_code")
    private Disease disease;

    public DiscoverPK() {
    }

    public DiscoverPK(Country country, Disease disease) {
        this.country = country;
        this.disease = disease;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiscoverPK that = (DiscoverPK) o;
        return country.equals(that.country) && disease.equals(that.disease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, disease);
    }
}
