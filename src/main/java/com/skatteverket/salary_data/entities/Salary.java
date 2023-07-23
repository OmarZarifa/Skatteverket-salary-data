package com.skatteverket.salary_data.entities;

import jakarta.persistence.*;


@Entity
public class Salary {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "antal_dagar")
  private String antalDagar;

  @Column(name = "tabellnr")
  private int tabellNr;

  @Column(name = "Inkomst_from")
  private int inkomstFrom;

  @Column(name = "Inkomst_tom")
  private int inkomstTom;

  @Column(name = "Kolumn1")
  private int kolumn1;

  @Column(name = "Kolumn2")
  private int kolumn2;

  @Column(name = "Kolumn3")
  private int kolumn3;

  @Column(name = "Kolumn4")
  private int kolumn4;

  @Column(name = "Kolumn5")
  private int kolumn5;

  @Column(name = "Kolumn6")
  private int kolumn6;

  @Column(name = "Kolumn7")
  private int kolumn7;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAntalDagar() {
    return antalDagar;
  }

  public void setAntalDagar(String antalDagar) {
    this.antalDagar = antalDagar;
  }

  public int getTabellNr() {
    return tabellNr;
  }

  public void setTabellNr(int tabellNr) {
    this.tabellNr = tabellNr;
  }

  public int getInkomstFrom() {
    return inkomstFrom;
  }

  public void setInkomstFrom(int inkomstFrom) {
    this.inkomstFrom = inkomstFrom;
  }

  public int getInkomstTom() {
    return inkomstTom;
  }

  public void setInkomstTom(int inkomstTom) {
    this.inkomstTom = inkomstTom;
  }

  public int getKolumn1() {
    return kolumn1;
  }

  public void setKolumn1(int kolumn1) {
    this.kolumn1 = kolumn1;
  }

  public int getKolumn2() {
    return kolumn2;
  }

  public void setKolumn2(int kolumn2) {
    this.kolumn2 = kolumn2;
  }

  public int getKolumn3() {
    return kolumn3;
  }

  public void setKolumn3(int kolumn3) {
    this.kolumn3 = kolumn3;
  }

  public int getKolumn4() {
    return kolumn4;
  }

  public void setKolumn4(int kolumn4) {
    this.kolumn4 = kolumn4;
  }

  public int getKolumn5() {
    return kolumn5;
  }

  public void setKolumn5(int kolumn5) {
    this.kolumn5 = kolumn5;
  }

  public int getKolumn6() {
    return kolumn6;
  }

  public void setKolumn6(int kolumn6) {
    this.kolumn6 = kolumn6;
  }

  public int getKolumn7() {
    return kolumn7;
  }

  public void setKolumn7(int kolumn7) {
    this.kolumn7 = kolumn7;
  }



}