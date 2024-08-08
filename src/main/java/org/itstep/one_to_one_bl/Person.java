package org.itstep.one_to_one_bl;

import lombok.Data;

import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

@Data
@Entity
@Table(name = "person", uniqueConstraints = @UniqueConstraint(columnNames = {"first_name", "last_name"}))
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne(mappedBy = "person")
    private Passport passport;


    @Override
    public String toString() {
        return "Person [id=" + id + ", firstName=" + firstName + "]\n" +
                "\tPassport [id=" + id + ", number=" + passport.getNumber() + "]";
    }
} 