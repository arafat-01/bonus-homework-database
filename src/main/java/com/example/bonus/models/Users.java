package com.example.bonus.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column(nullable = false, unique = true, length = 60)
    private String email;

    @Column(length = 30)
    private String name;

    @Column(length = 40)
    private String surname;

    private int salary;

    @Column(length = 20)
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cname")
    private Country country;

    @OneToOne(mappedBy = "publicServantPK.users", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private PublicServant publicServant;

    @OneToOne(mappedBy = "doctorPK.users", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Doctor doctor;

    public Users() {
    }

    public Users(String email, String name, String surname, int salary, String phone, Country country) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.phone = phone;
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
