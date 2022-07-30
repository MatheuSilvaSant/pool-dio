import br.com.dio.desafio.dominio.*;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java");
        bootcamp.setDescription("Descrição Bootcamp Java");
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(men1);

        Dev devM = new Dev();
        devM.setName("Matheus");
        devM.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devM.getConteudosInscritos());

        devM.progredir();
        devM.progredir();
        System.out.println("Conteúdos Inscritos" + devM.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + devM.getConteudosConcluidos());
        System.out.println("XP: " + devM.calcularTotalXp());

        System.out.println("--------");

        Dev devJ = new Dev();
        devJ.setName("Joao");
        devJ.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscritos" + devJ.getConteudosInscritos());
        devJ.progredir();
        devJ.progredir();
        devJ.progredir();

        System.out.println("Contéudos Inscritos" + devJ.getConteudosInscritos());
        System.out.println("Contéudos concluidos" + devJ.getConteudosConcluidos());

        System.out.println("XP: " + devJ.calcularTotalXp());



    }
}
