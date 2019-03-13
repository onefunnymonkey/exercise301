package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Dog {
    @Id
    @NotNull
    private long id;

    @NotNull
    private String name;

    @NotNull
    @Min(1)
    private long age;

    public Dog(@NotNull long id, @NotNull String name, @NotNull @Min(1) long age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

}
