package com.example.bonus.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "discover")
public class Discover implements Serializable {

    @EmbeddedId
    private DiscoverPK discoverPK;

    @Column(name = "first_enc_date")
    private Date firstEncDate;

    public Discover() {
    }

    public Discover(DiscoverPK discoverPK, Date firstEncDate) {
        this.discoverPK = discoverPK;
        this.firstEncDate = firstEncDate;
    }

    public DiscoverPK getDiscoverPK() {
        return discoverPK;
    }

    public void setDiscoverPK(DiscoverPK discoverPK) {
        this.discoverPK = discoverPK;
    }

    public Date getFirstEncDate() {
        return firstEncDate;
    }

    public void setFirstEncDate(Date firstEncDate) {
        this.firstEncDate = firstEncDate;
    }
}
