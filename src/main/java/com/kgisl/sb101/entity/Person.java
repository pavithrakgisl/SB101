package com.kgisl.sb101.entity;
 
import org.springframework.data.annotation.Id;
 
public record Person(@Id Integer id, String uname, String email) {

}


