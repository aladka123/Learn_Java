package com.company;

public class Movies {
    public int id;
    public String name;
    public String type;
    public int length;
    public String producer;
    public int year;

    public Movies(int id, String name, String type, int length, String producer, int year) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.length = length;
        this.producer = producer;
        this.year = year;
    }
    public String getType(){
    return type;
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

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                '}';
    }
}
