package com.springSprint.spring_mvc_application_sprint.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "cadastro") // Corrigido para minúsculo, como no banco da Azure
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome_completo", nullable = false)
    private String nomeCompleto;

    @Column(name = "cep", nullable = false)
    private String cep;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "ocorrencia", nullable = false)
    private String ocorrencia;

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }
}
