package com.rinyal.profile.Entities;


public class Projects {

  private long id;
  private long userId;
  private String name;
  private String description;
  private String technologies;
  private String linkDemo;
  private String linkSource;
  private String imageUrl;
  private java.sql.Date startDate;
  private java.sql.Date endDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getTechnologies() {
    return technologies;
  }

  public void setTechnologies(String technologies) {
    this.technologies = technologies;
  }


  public String getLinkDemo() {
    return linkDemo;
  }

  public void setLinkDemo(String linkDemo) {
    this.linkDemo = linkDemo;
  }


  public String getLinkSource() {
    return linkSource;
  }

  public void setLinkSource(String linkSource) {
    this.linkSource = linkSource;
  }


  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public java.sql.Date getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Date startDate) {
    this.startDate = startDate;
  }


  public java.sql.Date getEndDate() {
    return endDate;
  }

  public void setEndDate(java.sql.Date endDate) {
    this.endDate = endDate;
  }

}
