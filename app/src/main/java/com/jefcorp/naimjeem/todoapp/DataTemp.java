package com.jefcorp.naimjeem.todoapp;

/**
 * Created by naim on 3/20/18.
 */

public class DataTemp {
  private int id;
  private String name;
  private String phone;

  public DataTemp(String n, String p) {
    name = n;
    phone = p;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPhone() {
    return phone;
  }
}
