package com.workflow.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workflows")
public class WorkflowController {

    @GetMapping
    public String getAllWorkflows() {
        return "List of all workflows";
    }

    @GetMapping("/{id}")
    public String getWorkflowById(@PathVariable String id) {
        return "Details of workflow with ID: " + id;
    }

    @PostMapping
    public String createWorkflow(@RequestBody String workflow) {
        return "Workflow created: " + workflow;
    }

    @PutMapping("/{id}")
    public String updateWorkflow(@PathVariable String id, @RequestBody String workflow) {
        return "Workflow updated with ID: " + id + " Data: " + workflow;
    }

    @DeleteMapping("/{id}")
    public String deleteWorkflow(@PathVariable String id) {
        return "Workflow deleted with ID: " + id;
    }
} 
