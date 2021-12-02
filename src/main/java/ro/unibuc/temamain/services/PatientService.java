package ro.unibuc.temamain.services;

import ro.unibuc.temamain.dtos.PatientDto;

import java.util.Set;

public interface PatientService {

    void addPatient(PatientDto patientDto);

    Set<PatientDto> getAllPatients();



}
