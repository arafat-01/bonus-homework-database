package com.example.bonus.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PublicServantPK implements Serializable {
    @OneToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "email", nullable = false, unique = true)
    private Users users;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublicServantPK that = (PublicServantPK) o;
        return users.equals(that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }
}
