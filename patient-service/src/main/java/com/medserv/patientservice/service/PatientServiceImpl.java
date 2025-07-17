package com.medserv.patientservice.service;

import com.medserv.patientservice.dto.PatientResponseDTO;
import com.medserv.patientservice.model.Patient;
import com.medserv.patientservice.repository.PatientRepository;

import java.util.List;

public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<PatientResponseDTO> getPatients() {
        List<Patient> patientList = patientRepository.findAll();
        return null;
    }
}
