package com.workflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.workflow.repository.WorkflowRepository;
import com.workflow.model.Workflow;

import java.util.List;
import java.util.Optional;

@Service
public class WorkflowService {

    @Autowired
    private WorkflowRepository workflowRepository;

    // Create
    public Workflow createWorkflow(Workflow workflow) {
        return workflowRepository.save(workflow);
    }

    // Read
    public List<Workflow> getAllWorkflows() {
        return workflowRepository.findAll();
    }

    public Optional<Workflow> getWorkflowById(Long id) {
        return workflowRepository.findById(id);
    }

    // Update
    public Workflow updateWorkflow(Long id, Workflow workflowDetails) {
        Workflow workflow = workflowRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Workflow not found with id: " + id));
        workflow.setName(workflowDetails.getName());
        workflow.setDescription(workflowDetails.getDescription());
        // Add other attributes as necessary
        return workflowRepository.save(workflow);
    }

    // Delete
    public void deleteWorkflow(Long id) {
        Workflow workflow = workflowRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Workflow not found with id: " + id));
        workflowRepository.delete(workflow);
    }
}