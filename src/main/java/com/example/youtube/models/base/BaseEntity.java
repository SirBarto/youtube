package com.example.youtube.models.base;

import com.example.youtube.models.User;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Field;

@MappedSuperclass
public abstract class BaseEntity implements Serializable,Cloneable {
    private static final long serialVersionUID = 1234567891;

    @Transient
    private Long version;

    @PreUpdate
    protected void preUpdate() {
    }

    @PrePersist
    protected void preRemove() {
    }

    @PostPersist
    protected void postPersist() {
    }

    @PostUpdate
    protected void postUpdata() {
    }

    @PostRemove
    protected void postRemove() {
    }

    @PostLoad
    protected void postLoad() {
    }

    public Boolean containsUsers() {
        Field[] fields = this.getClass().getFields();
        if (fields == null) {
            return false;
        }
        for (Field field : fields) {
            if (field.getType() == null) {
                continue;
            }
            if(field.getType().equals(User.class))
            {
                return true;
            }
        }
        return false;
    }

    public Long getUsersId(){
        if(this.containsUsers()){
            Field f = null;
            try{
                f = this.getClass().getField("id");
            }catch (NoSuchFieldException e){
                e.printStackTrace();
            }
            if(f==null){
                return null;
            }
            try {
                return f.getLong(this);
            }catch (IllegalAccessException e){
                e.printStackTrace();
            }
        }
        return null;
    }
    public void injectUser(User user){
        if(user == null){return;}
        if(this.containsUsers()){
            Field[] declaredFields = this.getClass().getDeclaredFields();
            if(declaredFields == null){return;}
            for (Field field : declaredFields){
                if(!User.class.equals(field.getType())){
                    continue;
                }
                try {
                    field.set(this,user);
                }catch (IllegalAccessException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version){
        this.version=version;
    }
}
