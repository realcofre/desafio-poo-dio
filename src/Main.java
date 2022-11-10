import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria do java");
        mentoria.setDescricao("descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();
        List<String> palavras = new ArrayList<>();

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRenato = new Dev();
        devRenato.setNome("Renato");
        devRenato.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Renato: " + devRenato.getConteudosInscritos());
        devRenato.progredir();
        devRenato.progredir();
        System.out.println("------------------");
        System.out.println("Conteúdos Inscritos Renato: " + devRenato.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Renato: " + devRenato.getConteudosConcluidos());
        System.out.println("XP:" + devRenato.calcularTotalXp());

        System.out.println("------------------");
        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alexandre: " + devAlexandre.getConteudosInscritos());
        devAlexandre.progredir();
        devAlexandre.progredir();
        devAlexandre.progredir();
        System.out.println("------------------");

        System.out.println("Conteúdos Inscritos Alexandre: " + devAlexandre.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alexandre: " + devAlexandre.getConteudosConcluidos());
        System.out.println("XP:" + devAlexandre.calcularTotalXp());

    }
}
