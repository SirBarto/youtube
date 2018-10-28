package com.example.youtube.models;

import com.example.youtube.models.base.BaseEntity;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "beers", schema = "public")
public class Beer extends BaseEntity{
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "beer_id",nullable = false)
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
    private Long id;

    @Basic
    @Column(name ="name")
    private String name;

    @Basic
    @Column(name ="abv")
    private String abv;

    @Basic
    @Column(name ="ratings")
    private Float ratings;

    public Beer(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbv() {
        return abv;
    }

    public void setAbv(String abv) {
        this.abv = abv;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }
/*
    @OneToMany(mappedBy = "beersByNameId",cascade = CascadeType.ALL)
    private Collection<BeersAuthor>beersAuthorsBy
*/ //jeden : wiele z druga tabela


    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null || getClass() != o.getClass())return false;

        Beer beer = (Beer) o;

        if(!id.equals(beer.id))return false;
        if(name !=null ? !name.equals(beer.name):beer.name != null) return false;
        if(abv !=null ? !abv.equals(beer.abv):beer.abv !=null)return false;
    return ratings != null ? ratings.equals(beer.ratings) : beer.ratings==null;
    }
}
