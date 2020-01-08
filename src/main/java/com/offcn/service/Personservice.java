package com.offcn.service;

import com.offcn.po.Person;

import java.util.List;

public interface Personservice {
    public void add(Person person);
    public void update(Person person);
    public void delete(Long id);
    public Person findone(Long id);
    public List<Person> findall();
}
