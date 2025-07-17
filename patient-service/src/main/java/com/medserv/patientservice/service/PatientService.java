package com.medserv.patientservice.service;

import com.medserv.patientservice.dto.PatientResponseDTO;

import java.util.List;

public interface PatientService {
    public List<PatientResponseDTO> getPatients();
}
