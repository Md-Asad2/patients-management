package com.medserv.patientservice.service;

import com.medserv.patientservice.dto.PatientRequestDTO;
import com.medserv.patientservice.dto.PatientResponseDTO;

import java.util.List;
import java.util.UUID;

public interface PatientService {

    public List<PatientResponseDTO> getPatients();

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO);

    public PatientResponseDTO updatePatient(UUID id, PatientRequestDTO patientRequestDTO);

    public void deletePatient(UUID id);
}
