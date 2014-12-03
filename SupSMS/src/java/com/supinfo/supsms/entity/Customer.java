/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.supinfo.supsms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Clement
 */
@Entity
@Inheritance (strategy=InheritanceType.JOINED)
@Table(name = "customer")
@XmlRootElement
public abstract class Customer implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String first_name;
    private String last_name;
    private String password;
    private String email;
    
    @NotNull
    @Column(nullable=false)
    private Long phone;
    
    @NotNull
    @Column(nullable=false)
    private Date created;
    
    public Customer(){
        super();
    }
    
}
