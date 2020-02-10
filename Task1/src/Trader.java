/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Trader {
    
    private String companyName;
    private String location;
    private String services;
    private int numEmployees;
    private double dailyRate;
    private String description;

    public Trader(String companyName, String location, String services, int numEmployees, double dailyRate, String description) {
        this.companyName = companyName;
        this.location = location;
        this.services = services;
        this.numEmployees = numEmployees;
        this.dailyRate = dailyRate;
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }

    public String getServices() {
        return services;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public String getDescription() {
        return description;
    }
    
    public String toString() {
        StringBuilder str = new StringBuilder(1000);
        str.append("-----------------------------------------------------------");
        str.append("\nCompany name:            ").append(getCompanyName());
        str.append("\nLocation:                ").append(getLocation());
        str.append("\nServices offered:        ").append(getServices());
        str.append("\nNumber of employees:     ").append(getNumEmployees());
        str.append("\nDaily call out rate (£): ").append(getDailyRate());
        str.append("\nOther information:       ").append(getDescription());
        str.append("\n-----------------------------------------------------------");
        return str.toString();
    }
    
}
