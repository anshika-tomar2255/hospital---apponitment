package com.thinkconstrive.hospital_apponitment.controller;

import com.thinkconstrive.hospital_apponitment.patient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class patientAPIservice {
   patient patient;


   @GetMapping("{patientID}")
   public patient getpatientdetails(String patientId) {


      return  patient;
   }
   @PostMapping
public String createpatient(@RequestBody patient patient) {
      this.patient = patient;
      return "patient created sucessfully";
   }
    @PutMapping
    public String updatepatient(@RequestBody patient patient) {
        this.patient = patient;
        return "patient updated sucessfully";

    }
    @DeleteMapping("{patientID}")
    public String deletepatient(String patientId) {
        this.patient = null;
        return "patient deleted sucessfully";
    }

}
