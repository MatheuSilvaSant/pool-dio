package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate dateNow = LocalDate.now();
    private final LocalDate dateFinish = dateNow.plusDays(45);
    private Set<Dev> devsInscribed = new HashSet<Dev>();
    private Set<Conteudo> conteudo = new LinkedHashSet<Conteudo>();


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

    public LocalDate getDateNow() {
        return dateNow;
    }

    public LocalDate getDateFinish() {
        return dateFinish;
    }

    public Set<Dev> getDevsInscribed() {
        return devsInscribed;
    }

    public void setDevsInscribed(Set<Dev> devsInscribed) {
        this.devsInscribed = devsInscribed;
    }

    public Set<Conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(Set<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(dateNow, bootcamp.dateNow) && Objects.equals(dateFinish, bootcamp.dateFinish) && Objects.equals(devsInscribed, bootcamp.devsInscribed) && Objects.equals(conteudo, bootcamp.conteudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dateNow, dateFinish, devsInscribed, conteudo);
    }
}
