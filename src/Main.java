import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        Curso curso1 = new Curso();
       curso1.setDescription("Curso em java");
       curso1.setCargaHoraria(8);
       curso1.setTitle("Java");

        Mentoria men1 = new Mentoria();
        men1.setTitle("Mentoria java");
        men1.setDescription("descrição java");
        men1.setDate(LocalDate.now());

        Curso curso2 = new Curso();
        curso2.setTitle("Python");
        curso2.setDescription("Curso em python");
        curso2.setCargaHoraria(10);

       System.out.println(curso1 +" \n"+curso2 + " \n" + men1);
    }
}
