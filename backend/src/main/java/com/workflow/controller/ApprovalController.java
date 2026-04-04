package com.workflow.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/approvals")
public class ApprovalController {

    @GetMapping
    public List<String> getAllApprovals() {
        // Logic to retrieve all approvals
        return List.of("Approval1", "Approval2");
    }

    @PostMapping
    public String createApproval(@RequestBody String approval) {
        // Logic to create a new approval
        return "Approval created: " + approval;
    }

    @GetMapping("/{id}")
    public String getApprovalById(@PathVariable String id) {
        // Logic to retrieve an approval by ID
        return "Approval details for ID: " + id;
    }

    @PutMapping("/{id}")
    public String updateApproval(@PathVariable String id, @RequestBody String approval) {
        // Logic to update an existing approval
        return "Approval updated for ID: " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteApproval(@PathVariable String id) {
        // Logic to delete an approval
        return "Approval deleted for ID: " + id;
    }
}