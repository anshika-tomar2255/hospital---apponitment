package org.example.service;

import org.example.model.Appointment;
import org.example.repository.AppointmentRepository;

import java.util.List;

public class AppointmentService {
    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    public Appointment bookAppointment(Appointment appointment) {
        return repository.save(appointment);
    }

    public List<Appointment> getAllAppointments() {
        return repository.findAll();
    }

    public Appointment getAppointmentById(Long id) {
        return repository.findById(id);
    }

    public void updateAppointment(Appointment appointment) {
        repository.update(appointment);
    }

    public void cancelAppointment(Long id) {
        repository.delete(id);
    }
}
