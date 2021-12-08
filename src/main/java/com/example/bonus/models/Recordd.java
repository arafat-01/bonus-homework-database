package com.example.bonus.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "record")
public class Recordd implements Serializable {

    @EmbeddedId
    private RecordPK recordPK;

    @Column(name = "total_deaths")
    private int totalDeaths;

    @Column(name = "total_patients")
    private int totalPatients;

    public Recordd() {
    }

    public Recordd(RecordPK recordPK, int totalDeaths, int totalPatients) {
        this.recordPK = recordPK;
        this.totalDeaths = totalDeaths;
        this.totalPatients = totalPatients;
    }

    public RecordPK getRecordPK() {
        return recordPK;
    }

    public void setRecordPK(RecordPK recordPK) {
        this.recordPK = recordPK;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(int totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public int getTotalPatients() {
        return totalPatients;
    }

    public void setTotalPatients(int totalPatients) {
        this.totalPatients = totalPatients;
    }
}
