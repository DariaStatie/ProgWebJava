package ro.unibuc.temamain.repositories;

import ro.unibuc.temamain.model.Patient;

import java.util.List;

public interface PatientRepository {

    Patient add (Patient patient);

    List<Patient> findAll();

}
