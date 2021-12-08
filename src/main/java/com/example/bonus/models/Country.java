package com.example.bonus.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "country")
public class Country {

    @Id
    @Column(name = "cname")
    private String cname;

    @Column(name = "population")
    private Long population;

    @OneToMany(mappedBy = "discoverPK.country",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Discover> discovers = new ArrayList<>();

    @OneToMany(mappedBy = "country",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Users> users = new ArrayList<>();


    public Country(String cname, Long population) {
        this.cname = cname;
        this.population = population;
    }

    public Country() {
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }
}
