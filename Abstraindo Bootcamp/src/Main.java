import java.time.LocalDate;

import models.Bootcamp;
import models.Curso;
import models.Dev;
import models.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHorario(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devThi = new Dev();
        devThi.setNome("Thiago");
        devThi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devThi.getConteudosInscritos());
        devThi.progredir();
        System.out.println("----");
        System.out.println("Conteúdos Concluídos: " + devThi.getConteudosConcluidos());
        System.out.println("XP: " + devThi.calcularXp());

        System.out.println("----");


        Dev devJu = new Dev();
        devJu.setNome("Juliana");
        devJu.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devJu.getConteudosInscritos());
        devJu.progredir();
        devJu.progredir();
        System.out.println("----");
        System.out.println("Conteúdos Concluídos: " + devJu.getConteudosConcluidos());
        System.out.println("XP: " + devJu.calcularXp());


        
    }
}
