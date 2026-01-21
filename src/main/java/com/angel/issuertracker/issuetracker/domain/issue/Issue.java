package com.angel.issuertracker.issuetracker.domain.issue;

import java.time.LocalDateTime;
import java.util.UUID;

public class Issue {

    private UUID id;
    private String title;
    private String description;
    private IssueStatus status;
    private IssuePriority priority;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Issue(UUID id,
                 String title,
                 String description,
                 IssueStatus status,
                 IssuePriority priority,
                 LocalDateTime createdAt,
                 LocalDateTime updatedAt) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters (solo getters por ahora)
    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public IssueStatus getStatus() {
        return status;
    }

    public IssuePriority getPriority() {
        return priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}