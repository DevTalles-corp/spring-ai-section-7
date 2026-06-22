package com.devtalles.medassistant.repository;

import com.devtalles.medassistant.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    //WHERE doctor_id IN (1, 3, 5) AND date = '2026-06-23' AND available = true
    List<Appointment> findByDoctorIdInAndDateAndAvailableTrue(
            List<Long> doctorIds, LocalDate date);

}
