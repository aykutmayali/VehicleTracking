/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicletracking.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author burakzengin
 */
@Entity
@Table(name = "vehicle", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id"})})
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, length = 11)
    private int id;

    @Column(name = "licenceNumber", nullable = false, length = 45)
    private String licenceNumber;

    @Column(name = "unitName", nullable = false, length = 45)
    private String unitName;

    @Column(name = "model", nullable = false, length = 45)
    private String model;

    @Column(name = "brand", nullable = false, length = 45)
    private String brand;

    @Column(name = "modelYear", nullable = false, length = 45)
    private String modelYear;

    @Column(name = "kind", nullable = false, length = 45)
    private String kind;

    @Column(name = "type", nullable = false, length = 45)
    private String type;

    @Column(name = "status", nullable = false, length = 45)
    private String status;

    public Vehicle() {
    }

    public Vehicle(String licenceNumber, String unitName, String model, String brand, String modelYear, String kind, String type, String status) {
        this.licenceNumber = licenceNumber;
        this.unitName = unitName;
        this.model = model;
        this.brand = brand;
        this.modelYear = modelYear;
        this.kind = kind;
        this.type = type;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
