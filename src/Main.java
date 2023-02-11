import br.com.desafio.dominio.BootCamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(10);
        curso1.setDescricao("Aprendendo Java.");
        curso1.setTitulo("Curso de Java");



        Curso curso2 = new Curso();
        curso2.setCargaHoraria(15);
        curso2.setDescricao("Aprendendo programar em Python.");
        curso2.setTitulo("Curso de Python");



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria BootCamp Orange TECH");
        mentoria1.setDescricao("Descricao da mentoria do BootCamp Orange TECH");
        mentoria1.setData(LocalDate.now());


        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Developer BackEnd");
        bootCamp.setDescricao("BootCamp realizado em parceria com Banco Inter para ensinar programacao.");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);


        Dev devErick = new Dev();
        devErick.setNome("Erick");
        devErick.inscreverBootCamp(bootCamp);
        System.out.println("Status cursos: "+ devErick.getNome() + devErick.getConteudosInscritos());
        System.out.println("Calculando XP");
        System.out.println(devErick.calcularTotalXP());
        System.out.println("Progredindo...");
        devErick.progredir();
        System.out.println("Status cursos: "+devErick.getConteudosInscritos());
        System.out.println("Status cursos: "+devErick.getConteudosConcluidos());
        System.out.println("Exibir XP");
        System.out.println(devErick.calcularTotalXP());


        System.out.println();

        Dev devGislaine= new Dev();
        devGislaine.setNome("Gislaine");
        devGislaine.inscreverBootCamp(bootCamp);
        System.out.println("Status cursos: "+ devGislaine.getNome()+devGislaine.getConteudosInscritos());
        devGislaine.progredir();
        devGislaine.progredir();
        devGislaine.progredir();
        System.out.println("Status cursos: "+devGislaine.getConteudosInscritos());
        System.out.println("Status cursos: "+devGislaine.getConteudosConcluidos());
        System.out.println("Exibir XP: "+devGislaine.calcularTotalXP());
    }
}