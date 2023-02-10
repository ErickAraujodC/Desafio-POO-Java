import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(88);
        curso1.setDescricao("BootCamp BackEnd Orange TECH");
        curso1.setTitulo("Java");
        System.out.println(curso1);


        Curso curso2 = new Curso();
        curso2.setCargaHoraria(114);
        curso2.setDescricao("BootCamp Java");
        curso2.setTitulo("Java");
        System.out.println(curso2);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria BootCamp Orange TECH");
        mentoria1.setDescricao("Descricao da mentoria do BootCamp Orange TECH");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);


    }
}