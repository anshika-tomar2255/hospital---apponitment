 package org.example.repository;

import org.example.model.Appointment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;





public class InMemoryAppointmentRepository implements AppointmentRepository {
    private static final List<Appointment> appointments = new ArrayList<>();
    private static final AtomicLong counter = new AtomicLong();

    @Override
    public Appointment save(Appointment appointment) {
        appointment.setId(counter.incrementAndGet());
        appointments.add(appointment);
        return appointment;
    }

    @Override
    public List<Appointment> findAll() {
        return new ArrayList<>(appointments);
    }

    @Override
    public Appointment findById(Long id) {
        return appointments.stream()
                .filter(appointment -> appointment.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void update(Appointment appointment) {
        appointments.stream()
                .filter(a -> a.getId().equals(appointment.getId()))
                .findFirst()
                .ifPresent(a -> {
                    try {
                        a.wait(appointment.getPatientName());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    a.setAppointmentTime(appointment.getAppointmentTime());
                    a.setDoctorName(
                            appointment.getDoctorName());
                    a.getClass(appointment.getReason());
                });
    }

    @Override
    public void delete(Long id) {
        appointments.removeIf(appointment -> appointment.getId().equals(id));
    }
}

