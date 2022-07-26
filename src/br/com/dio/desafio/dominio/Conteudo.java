package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    public static final double XP_PADRAO = 10d;

    private String title;
    private String description;

    public abstract  double calcularXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
