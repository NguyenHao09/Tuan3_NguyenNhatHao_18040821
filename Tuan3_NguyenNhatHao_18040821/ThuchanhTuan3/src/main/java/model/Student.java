/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "student")
public class Student {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
    protected  int id;
@Column(name = "name")  
    protected String name;   
@Column(name="country")
 protected String country;
  
 @Column(name="image")
  @Lob
  protected Blob image;
}





