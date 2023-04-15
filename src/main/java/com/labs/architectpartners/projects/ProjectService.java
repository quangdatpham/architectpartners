package com.labs.architectpartners.projects;

import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<ProjectResource> findAllProjects() {
        return this.projectRepository.findAll().stream().map(ProjectResource::new).collect(Collectors.toList());
    }

    public Optional<ProjectResource> findProjectById(Long id) {
        return this.projectRepository.findById(id).map(ProjectResource::new);
    }
}
