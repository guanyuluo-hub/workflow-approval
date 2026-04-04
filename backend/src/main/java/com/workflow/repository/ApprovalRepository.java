package com.workflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.workflow.model.Approval;

public interface ApprovalRepository extends JpaRepository<Approval, Long> {
    // Additional query methods can be defined here
}