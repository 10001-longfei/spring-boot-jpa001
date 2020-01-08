package com.offcn.service;

import com.offcn.dao.PersonDao;

import com.offcn.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonserviceImpl implements Personservice{
    @Autowired
  private PersonDao personDao;


    @Override
    public void add(Person person) {
        personDao.save(person);
    }

    @Override
    public void update(Person person) {
   personDao.saveAndFlush(person);
    }

    @Override
    public void delete(Long id) {
personDao.deleteById(id);
    }

    @Override
    public Person findone(Long id) {
        return personDao.findById(id).get();
    }

    @Override
    public List<Person> findall() {
        return personDao.findAll();
    }
}
