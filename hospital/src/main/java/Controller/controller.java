package Controller;

import org.example.model.Appointment;
import org.example.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PostMapping
    public Appointment bookAppointment(@RequestBody Appointment appointment) {
        return service.bookAppointment(appointment);
    }

    @GetMapping
    public List<Appointment> getAllAppointments() {
        return service.getAllAppointments();
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
        return service.getAppointmentById(id);
    }

    @PutMapping
    public void updateAppointment(@RequestBody Appointment appointment) {
        service.updateAppointment(appointment);
    }

    @DeleteMapping("/{id}")
    public void cancelAppointment(@PathVariable Long id) {
        service.cancelAppointment(id);
    }
}

