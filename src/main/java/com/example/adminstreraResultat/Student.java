package com.example.adminstreraResultat;

public class Student {
    private Long id;
    private String namn;
    private String omdomeCanvas;
    private String betygLadok;
    private Integer examinationsdatum;
    private String Status;
    private String hinder;

    public Student(Long id, String namn, String omdomeCanvas, String betygLadok, Integer examinationsdatum, String status, String hinder) {
        this.id = id;
        this.namn = namn;
        this.omdomeCanvas = omdomeCanvas;
        this.betygLadok = betygLadok;
        this.examinationsdatum = examinationsdatum;
        Status = status;
        this.hinder = hinder;
    }



    public Student() {
    }

    public Student(String namn, String betygLadok) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getOmdomeCanvas() {
        return omdomeCanvas;
    }

    public void setOmdomeCanvas(String omdomeCanvas) {
        this.omdomeCanvas = omdomeCanvas;
    }

    public String getBetygLadok() {
        return betygLadok;
    }

    public void setBetygLadok(String betygLadok) {
        this.betygLadok = betygLadok;
    }

    public Integer getExaminationsdatum() {
        return examinationsdatum;
    }

    public void setExaminationsdatum(Integer examinationsdatum) {
        this.examinationsdatum = examinationsdatum;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getHinder() {
        return hinder;
    }

    public void setHinder(String hinder) {
        this.hinder = hinder;
    }
}
