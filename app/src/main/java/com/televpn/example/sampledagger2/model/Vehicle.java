package com.televpn.example.sampledagger2.model;

/**
 * Created by vmlinz on 6/30/15.
 */
public class Vehicle {
    private Motor motor;

    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void increaseSpeed(int value) {
        motor.accelerate(value);
    }

    public void stop() {
        motor.brake();
    }

    public int getSpeed() {
        return motor.getRpm();
    }
}
