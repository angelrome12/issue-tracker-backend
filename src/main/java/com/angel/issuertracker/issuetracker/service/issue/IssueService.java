package com.angel.issuertracker.issuetracker.service.issue;

import com.angel.issuertracker.issuetracker.domain.issue.Issue;
import com.angel.issuertracker.issuetracker.domain.issue.IssuePriority;
import com.angel.issuertracker.issuetracker.domain.issue.IssueStatus;
import com.angel.issuertracker.issuetracker.persistence.issue.IssueEntity;
import com.angel.issuertracker.issuetracker.persistence.issue.IssueRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class IssueService {

    private final IssueRepository issueRepository;

    public IssueService(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    public Issue createIssue(String title, String description, IssuePriority priority) {

        LocalDateTime now = LocalDateTime.now();

        Issue issue = new Issue(
                UUID.randomUUID(),
                title,
                description,
                IssueStatus.OPEN,
                priority,
                now,
                now
        );

        IssueEntity savedEntity =
                issueRepository.save(IssueMapper.toEntity(issue));

        return IssueMapper.toDomain(savedEntity);
    }
}