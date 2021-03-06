package com.reader.rss.pojo;

public class Site {
    private Integer siteId;

    private String siteTitle;

    private String siteIcon;

    private String siteUrl;

    private String siteCondition;

    @Override
    public String toString() {
        return "Site{" +
                "siteId=" + siteId +
                ", siteTitle='" + siteTitle + '\'' +
                ", siteIcon='" + siteIcon + '\'' +
                ", siteUrl='" + siteUrl + '\'' +
                ", siteCondition='" + siteCondition + '\'' +
                '}';
    }

    public Site(Integer siteId, String siteTitle, String siteIcon, String siteUrl, String siteCondition) {
        this.siteId = siteId;
        this.siteTitle = siteTitle;
        this.siteIcon = siteIcon;
        this.siteUrl = siteUrl;
        this.siteCondition = siteCondition;
    }

    public Site(String siteTitle, String siteUrl, String siteCondition) {
        this.siteTitle = siteTitle;
        this.siteUrl = siteUrl;
        this.siteCondition = siteCondition;
    }

    public Site(Site site) {
        this.siteId = site.getSiteId();
        this.siteTitle = site.getSiteTitle();
        this.siteIcon = site.getSiteIcon();
        this.siteUrl = site.getSiteUrl();
        this.siteCondition = site.getSiteCondition();
    }

    public Site() {
        super();
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getSiteTitle() {
        return siteTitle;
    }

    public void setSiteTitle(String siteTitle) {
        this.siteTitle = siteTitle == null ? null : siteTitle.trim();
    }

    public String getSiteIcon() {
        return siteIcon;
    }

    public void setSiteIcon(String siteIcon) {
        this.siteIcon = siteIcon == null ? null : siteIcon.trim();
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl == null ? null : siteUrl.trim();
    }

    public String getSiteCondition() {
        return siteCondition;
    }

    public void setSiteCondition(String siteCondition) {
        this.siteCondition = siteCondition == null ? null : siteCondition.trim();
    }
}