/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "USERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByUserId", query = "SELECT u FROM Users u WHERE u.userId = :userId"),
    @NamedQuery(name = "Users.findByName", query = "SELECT u FROM Users u WHERE u.name = :name"),
    @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password"),
    @NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.email = :email"),
    @NamedQuery(name = "Users.findByPhoneNum", query = "SELECT u FROM Users u WHERE u.phoneNum = :phoneNum"),
    @NamedQuery(name = "Users.findByImage", query = "SELECT u FROM Users u WHERE u.image = :image")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private Integer userId;
    @Size(max = 100)
    @Column(name = "NAME")
    private String name;
    @Size(max = 100)
    @Column(name = "PASSWORD")
    private String password;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 100)
    @Column(name = "PHONE_NUM")
    private String phoneNum;
    @Size(max = 100)
    @Column(name = "IMAGE")
    private String image;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private List<NotificationDetail> notificationDetailList;

    public Users() {
    }

//    public Users(String name, String image) {
//        this.name = name;
//        this.image = image;
//    }

    public Users(Integer userId, String name, String image) {
        this.userId = userId;
        this.name = name;
        this.image = image;
    }

    public Users(Integer userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public Users(Integer userId, String name, String password, String email, String phoneNum, String image) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNum = phoneNum;
        this.image = image;
    }



    
    
    public Users(String name, String password, String email, String phoneNum, String image) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNum = phoneNum;
        this.image = image;
    }

    public Users(Integer userId, String name, String email, String phoneNum, String image) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.image = image;
    }

    public Users(String name, String password, String email, String phoneNum) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNum = phoneNum;
    }

  
    
    

    public Users(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @XmlTransient
    public List<NotificationDetail> getNotificationDetailList() {
        return notificationDetailList;
    }

    public void setNotificationDetailList(List<NotificationDetail> notificationDetailList) {
        this.notificationDetailList = notificationDetailList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }
    
    public String duty(){
     return "User";   
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Users[ userId=" + userId + " ]";
    }
    
}
