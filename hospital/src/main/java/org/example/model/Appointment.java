package org.example.model;

import java.time.LocalDateTime;

public class Appointment {
    private Long id;
    private String patientName;
    private LocalDateTime appointmentTime;
    private String doctorName;
    private String reason;

    // Constructors, Getters, and Setters
    public Appointment(Long id, String patientName, LocalDateTime appointmentTime, String doctorName, String reason) {
        this.id = id;
        this.patientName = patientName;
        this.appointmentTime = appointmentTime;
        this.doctorName = doctorName;
        this.reason = reason;
    }

    public Object getId() {
        return null;
    }

    public long getPatientName() {
        return 0;
    }

    public Object getAppointmentTime() {
        return null;
    }

    public void setId(long l) {
    }

    public void setAppointmentTime(Object appointmentTime) {
    }

    public Object getDoctorName() {
        return null;
    }

    public void setDoctorName(Object doctorName) {
    }

    
    public Object getReason() {
        return null;
    }

    public void getClass(Object reason) {
    }
}
