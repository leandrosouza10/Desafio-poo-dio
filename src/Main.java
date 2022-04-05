import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        // System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeandro = new Dev();
        devLeandro.setNome("leandro");
        devLeandro.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Leandro: " + devLeandro.getConteudosInscritos());
        devLeandro.progredir();
        devLeandro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Leandro: " + devLeandro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Leandro: " + devLeandro.getConteudosConcluidos());
        System.out.println("XP:" + devLeandro.calcularTotalXp());


        System.out.println("---------");

        Dev devBarroso = new Dev();
        devBarroso.setNome("Barroso");
        devBarroso.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Barroso: " + devBarroso.getConteudosInscritos());
        devBarroso.progredir();
        devBarroso.progredir();
        devBarroso.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Barroso: " + devBarroso.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Barroso: " + devBarroso.getConteudosConcluidos());
        System.out.println("XP:" + devBarroso.calcularTotalXp());
    }
}
