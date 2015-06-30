package com.televpn.example.sampledagger2.module;

import com.televpn.example.sampledagger2.model.Motor;
import com.televpn.example.sampledagger2.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vmlinz on 6/30/15.
 */

@Module
public class VehicleModule {
    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}

