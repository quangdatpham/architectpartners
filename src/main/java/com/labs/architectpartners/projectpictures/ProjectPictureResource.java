package com.labs.architectpartners.projectpictures;

import java.io.Serializable;

public class ProjectPictureResource implements Serializable {

    private Long id;
    private String mobileUrl;
    private String tabletUrl;
    private String desktopUrl;
    private String alternativeText;

    public ProjectPictureResource() {
    }

    public ProjectPictureResource(Long id, String mobileUrl, String tabletUrl, String desktopUrl, String alternativeText) {
        this.id = id;
        this.mobileUrl = mobileUrl;
        this.tabletUrl = tabletUrl;
        this.desktopUrl = desktopUrl;
        this.alternativeText = alternativeText;
    }

    public ProjectPictureResource(ProjectPicture domainObject) {
        this.id = domainObject.getId();
        this.mobileUrl = domainObject.getMobileUrl();
        this.tabletUrl = domainObject.getTabletUrl();
        this.desktopUrl = domainObject.getDesktopUrl();
        this.alternativeText = domainObject.getAlternativeText();
    }

    public Long getId() {
        return id;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public String getTabletUrl() {
        return tabletUrl;
    }

    public String getDesktopUrl() {
        return desktopUrl;
    }

    public String getAlternativeText() {
        return alternativeText;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "mobileUrl = " + mobileUrl + ", " +
                "tabletUrl = " + tabletUrl + ", " +
                "desktopUrl = " + desktopUrl + ", " +
                "alternativeText = " + alternativeText + ")";
    }
}
