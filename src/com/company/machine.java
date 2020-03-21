package com.company;

class machine {

    private  String name;

    public machine(String name, int year) {
        this.name = name;
        this.year = year;
    }

    private int year;

    @Override
    public String toString() {
        return "machine{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }




}
