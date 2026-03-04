package com.example.demo;

public class Film {
    private Integer id;
    private String titolo;
    private String regista;
    private Integer  anno;

    public Film() {}
    public Film(Integer id, String titolo, String regista, Integer anno) {
        this.id = id;
        this.titolo = titolo;
        this.regista = regista;
        this.anno = anno;
    }

    public Integer getId() { return id; }
    public String getTitolo() { return titolo; }
    public String getRegista() { return regista; }
    public Integer getAnno() { return anno; }

    public void setId(Integer id) { this.id = id; }
    public void setTitolo(String titolo) { this.titolo = titolo; }
    public void setRegista(String regista) { this.regista = regista; }
    public void setAnno(Integer anno) { this.anno = anno; }
}