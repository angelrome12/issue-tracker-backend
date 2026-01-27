package com.angel.issuertracker.issuetracker.service.issue;

import com.angel.issuertracker.issuetracker.domain.issue.Issue;
import com.angel.issuertracker.issuetracker.persistence.issue.IssueEntity;

public class IssueMapper {

    public static IssueEntity toEntity(Issue issue) {
        return new IssueEntity(
                issue.getTitle(),
                issue.getDescription(),
                issue.getStatus(),
                issue.getPriority(),
                issue.getCreatedAt(),
                issue.getUpdatedAt()
        );
    }

    public static Issue toDomain(IssueEntity entity) {
        return new Issue(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getStatus(),
                entity.getPriority(),
                entity.getCreatedAt(),
                entity.getUpdatedAt()
        );
    }
}