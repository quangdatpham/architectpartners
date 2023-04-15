package com.labs.architectpartners.projects;

import com.labs.architectpartners.projectpictures.ProjectPictureResource;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectResource implements Serializable {

    private Long id;
    private String name;
    private List<ProjectPictureResource> pictures;
    private String description;

    public ProjectResource() {

    }

    public ProjectResource(Long id, String name, List<ProjectPictureResource> pictures, String description) {
        this.id = id;
        this.name = name;
        this.pictures = pictures;
        this.description = description;
    }

    public ProjectResource(Project domainObject) {
        this.id = domainObject.getId();
        this.name = domainObject.getName();
        this.pictures = domainObject.getPictures().stream().map(ProjectPictureResource::new).collect(Collectors.toList());
        this.description = domainObject.getDescription();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<ProjectPictureResource> getPictures() {
        return pictures;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "pictures = " + pictures + ", " +
                "description = " + description + ")";
    }
}
