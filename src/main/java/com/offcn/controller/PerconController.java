package com.offcn.controller;

import com.offcn.po.Person;
import com.offcn.service.Personservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PerconController {
    @Autowired
  private  Personservice personservice;
    @PostMapping("/")
    public String add(@RequestBody Person person){
        personservice.add(person);
        return "add";
    }
    @PutMapping("/{id}")
   public String update(@PathVariable("id") Long id, @RequestBody Person person){
       person.setId(id);
       personservice.update(person);
       return "update";
   }
   @DeleteMapping("/{id}")
   public String delete(@PathVariable("id") Long id){
        personservice.delete(id);
        return "delete";
   }
@GetMapping("/{id}")
   public Person findone(@PathVariable("id") Long id){
       return personservice.findone(id);
   }
   @GetMapping("/")
   public List<Person> findall(){
        return personservice.findall();
   }
}
