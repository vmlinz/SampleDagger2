package com.televpn.example.sampledagger2.component;

import com.televpn.example.sampledagger2.model.Vehicle;
import com.televpn.example.sampledagger2.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by vmlinz on 6/30/15.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();
}
