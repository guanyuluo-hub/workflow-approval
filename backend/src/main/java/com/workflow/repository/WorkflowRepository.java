package com.workflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.workflow.model.Workflow;

public interface WorkflowRepository extends JpaRepository<Workflow, Long> {
    // Custom query methods can be defined here if needed
}