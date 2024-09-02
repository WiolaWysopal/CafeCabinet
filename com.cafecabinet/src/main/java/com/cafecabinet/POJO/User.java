package com.cafecabinet.POJO;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.io.Serializable;

@NamedQuery(name = "User.findByEmailId", query = "select u from User u where u.email=:email")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "user")
@Data
public class User implements Serializable {

    // serialVersionUID - used during deserialization process to ensure
    // that the version of the class during serialization and deserialization is consistent.
    // This is recommended to avoid class versioning issues.
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") //Column name in database
    private Integer id; //Name of the variable in the entity

    @Column(name="name")
    private String name;

    @Column(name="contact_number")
    private String contactNumber;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="status")
    private String status;

    @Column(name="role")
    private String role;
}
