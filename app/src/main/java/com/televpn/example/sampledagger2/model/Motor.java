package com.televpn.example.sampledagger2.model;

/**
 * Created by vmlinz on 6/30/15.
 */
public class Motor {
    private int rpm;

    public Motor(int rpm) {
        this.rpm = rpm;
    }

    public Motor() {
        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int value) {
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}
