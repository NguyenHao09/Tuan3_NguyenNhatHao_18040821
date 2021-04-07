/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 *
 * @author TriPham
 */
public class StudentDTO {
     
 protected int id;

 protected String name;

 protected String email;
 

 protected String country;
   
  private String base64Image;
     
 public StudentDTO() {
 }
 
 public StudentDTO(String name, String email, String country) {
  super();
  this.name = name;
  this.email = email;
  this.country = country;
 }

  public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getEmail() {
  return email;
 }
 public void setEmail(String email) {
  this.email = email;
 }
 public String getCountry() {
  return country;
 }
 public void setCountry(String country) {
  this.country = country;
 }
 public String getBase64Image() {
        return base64Image;
    }
 
    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }
}
