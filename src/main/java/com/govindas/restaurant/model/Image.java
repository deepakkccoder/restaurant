package com.govindas.restaurant.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Lob
    private CommonsMultipartFile photo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CommonsMultipartFile getPhoto() {
        return photo;
    }

    public void setPhoto(CommonsMultipartFile photo) {
        this.photo = photo;
    }
}
