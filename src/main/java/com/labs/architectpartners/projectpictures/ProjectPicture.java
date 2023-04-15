package com.labs.architectpartners.projectpictures;

import com.labs.architectpartners.projects.Project;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

@Entity(name = "ProjectPicture")
@Table(name = "project_pictures")
public class ProjectPicture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "mobile_url", nullable = true)
    private String mobileUrl;

    @Column(name = "tablet_url", nullable = true)
    private String tabletUrl;

    @Column(name = "desktop_url", nullable = false)
    private String desktopUrl;

    @Column(name = "alternative_text", nullable = true)
    private String alternativeText;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Project.class)
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private Project project;

    @Column(name = "created_on", nullable = false)
    private Date createdOn;

    @Column(name = "updated_on", nullable = false)
    private Date updatedOn;

    public ProjectPicture() {
    }

    public ProjectPicture(Long id, String mobileUrl, String tabletUrl, String desktopUrl, String alternativeText, Project project, Date createdOn, Date updatedOn) {
        this.id = id;
        this.mobileUrl = mobileUrl;
        this.tabletUrl = tabletUrl;
        this.desktopUrl = desktopUrl;
        this.alternativeText = alternativeText;
        this.project = project;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }

    public String getTabletUrl() {
        return tabletUrl;
    }

    public void setTabletUrl(String tabletUrl) {
        this.tabletUrl = tabletUrl;
    }

    public String getDesktopUrl() {
        return desktopUrl;
    }

    public void setDesktopUrl(String desktopUrl) {
        this.desktopUrl = desktopUrl;
    }

    public String getAlternativeText() {
        return alternativeText;
    }

    public void setAlternativeText(String alternativeText) {
        this.alternativeText = alternativeText;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
