package ro.unibuc.temamain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.temamain.dtos.PatientDto;
import ro.unibuc.temamain.services.PatientService;

@Controller
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getPatientList(Model model) {
        model.addAttribute("patientList", service.getAllPatients());
        return "index";
    }

    @PostMapping("/")
    public String addPatient( PatientDto patientDto, Model model){
        service.addPatient(new PatientDto(patientDto.getName(), patientDto.getCnp()));
        model.addAttribute("patientList", service.getAllPatients());
        return "index";
    }
}
