package com.offcn.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_person")
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name",nullable = false,length = 200)
    private String name;

    @Column(name = "password",nullable = false,length = 18)
    private String password;

    @Column(name = "age",nullable = false,length = 20)
    private Integer age;

}
