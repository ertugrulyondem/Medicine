package com.example.ertugrul.med.Modal;

/**
 * Created by ERTUGRUL on 03.05.2018.
 */

public class Medicine {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Medicine medicine = (Medicine) o;

        return id == medicine.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    String Name;
    String Price;

}

