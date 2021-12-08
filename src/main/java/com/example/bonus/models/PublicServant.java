package com.example.bonus.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "public_servant")
public class PublicServant implements Serializable {

    @EmbeddedId
    private PublicServantPK publicServantPK;

    @Column(length = 50)
    private String department;

    public PublicServant() {
    }

    public PublicServant(PublicServantPK publicServantPK, String department) {
        this.publicServantPK = publicServantPK;
        this.department = department;
    }

    public PublicServantPK getPublicServantPK() {
        return publicServantPK;
    }

    public void setPublicServantPK(PublicServantPK publicServantPK) {
        this.publicServantPK = publicServantPK;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
