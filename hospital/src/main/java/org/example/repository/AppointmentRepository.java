package org.example.repository;

import org.example.model.Appointment;

import java.util.List;

public interface AppointmentRepository {
    Appointment save(Appointment appointment);
    List<Appointment> findAll();
    Appointment findById(Long id);
    void update(Appointment appointment);
    void delete(Long id);
}
