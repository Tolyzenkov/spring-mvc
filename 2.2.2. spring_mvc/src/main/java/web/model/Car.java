package web.model;

import web.controller.CarController;

import java.util.ArrayList;

public class Car {
    private long id;
    private String mark;
    private int millage;


    public Car(long id, String mark, int mileage) {
        this.id = id;
        this.mark = mark;
        this.millage = mileage;
    }

    public long getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public int getMillage() {
        return millage;
    }
}
