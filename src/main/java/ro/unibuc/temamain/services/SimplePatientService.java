package ro.unibuc.temamain.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ro.unibuc.temamain.dtos.PatientDto;
import ro.unibuc.temamain.model.Patient;
import ro.unibuc.temamain.repositories.PatientRepository;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class SimplePatientService implements PatientService{

    private final PatientRepository repo;

    public SimplePatientService(PatientRepository repo) {
        this.repo = repo;
    }

    @Override
    public void addPatient(PatientDto patientDto) {
        if(patientDto.getCnp()<= 0){
            System.out.println("Invalid patient cnp.");
            return;
        }
        repo.add(new Patient(patientDto.getName(), patientDto.getCnp()));
    }

    @Override
    public Set<PatientDto> getAllPatients() {
        return repo.findAll().stream()
                .map(patient -> new PatientDto(patient.getName(), patient.getCnp()))
                .collect(Collectors.collectingAndThen(Collectors.toCollection(LinkedHashSet::new), Collections::unmodifiableSet));
    }
}
