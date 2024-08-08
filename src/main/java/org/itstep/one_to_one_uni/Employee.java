package org.itstep.one_to_one_uni;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee")
@NamedQuery(name = "Employee.findByCity", query = "select e from Employee e where e.address.city = ?1")
@NamedQuery(name = "Employee.findByCity2", query = "select e from Employee e inner join Address a on e.address.id = a.id where a.city = ?1")
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private int age;

    @OneToOne
    //@JoinColumn(name = "address_id")
    private Address address;
}
