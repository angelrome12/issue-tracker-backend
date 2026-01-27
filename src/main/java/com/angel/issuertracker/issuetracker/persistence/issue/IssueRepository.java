package com.angel.issuertracker.issuetracker.persistence.issue;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface IssueRepository extends JpaRepository<IssueEntity, UUID> {
}