package com.example.youtube.models;

import com.example.youtube.models.base.BaseEntity;
import jdk.nashorn.internal.ir.annotations.Immutable;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;
import javax.validation.constraints.Null;

@Entity
//@Immutable
@Table(name = "users", schema = "public")
public class User extends BaseEntity{

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id",nullable = false)
    @GenericGenerator(
            name = "generator",
            strategy = "sequence-identity",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name = "sequence",
                            value = "DEFAULTDBSEQ"
                    )
            })
    @GeneratedValue(generator = "generator")
   // @Column(name = "user_id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "login",nullable = false)
    private String login;

    @Basic
    @Column(name = "password")
    private String password;

    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "last_name")
    private String lastname;

    @Basic
    @Column(name = "mail",nullable = false,length = 1024)
    private String mail;

    @Basic
    @Column(name = "registration_number")
    private String registrationNumber;

    public User(){}

    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null || getClass() != o.getClass())return false;

        User user = (User) o;

        if(!id.equals(user.id))return false;
        if(!login.equals(user.login))return false;
        if(password!= null ? !password.equals(user.password): user.password!=null)return false;
        if(name !=null ? !name.equals(user.name) :user.name!=null)return false;
        if(lastname!= null ? !lastname.equals(user.lastname): user.lastname!=null)return false;
        if(registrationNumber!= null ? !registrationNumber.equals(user.registrationNumber): user.registrationNumber!=null)return false;
        return mail.equals(user.mail);
    }
    @Override //hashCode()
    public int hashCode(){
        int result = id.hashCode();
        result = 31 * result + login.hashCode();
        result = 31 * result +(password !=null ? password.hashCode():0);
        result = 31 * result +(name !=null ? name.hashCode():0);
        result = 31 * result +(lastname !=null ? lastname.hashCode():0);
        result = 31 * result +(registrationNumber !=null ? registrationNumber.hashCode():0);
        result = 31 * result +(mail !=null ? mail.hashCode():0);
        return result;
    }
    @Override
    public String toString(){
        return "User{" +
                "user_id" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", last_name='" + lastname + '\'' +
                ", registration_number='" + registrationNumber + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
