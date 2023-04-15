package com.labs.architectpartners.projects;

import org.apache.coyote.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/projects")
public class ProjectAPI {

    private final ProjectService projectService;

    public ProjectAPI(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping(value = {"", "/"})
    public ResponseEntity<List<ProjectResource>> findAllProjects() {
        return ResponseEntity.ok(projectService.findAllProjects());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProjectResource> findProjectById(@PathVariable("id") Long projectId) {
        return projectService.findProjectById(projectId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
