package com.financialsanctionimporter.importer.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financialsanctionimporter.importer.model.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Long> {
}
