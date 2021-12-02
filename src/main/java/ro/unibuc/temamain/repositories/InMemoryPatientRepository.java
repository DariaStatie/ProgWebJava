package ro.unibuc.temamain.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ro.unibuc.temamain.model.Patient;

import java.util.ArrayList;
import java.util.List;

@Service
public final class InMemoryPatientRepository implements PatientRepository{

    private final List<Patient> patientList = new ArrayList<>();
    private int idCounter;

    @Override
    public Patient add(Patient patient) {
        final var registerPatient = new Patient(++idCounter, patient.getName(), patient.getCnp());
        patientList.add(patient);
        return registerPatient;
    }

    @Override
    public List<Patient> findAll() {
        return List.copyOf(patientList);
    }


}
