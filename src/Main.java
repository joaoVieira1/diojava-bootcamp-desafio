import Dominio.Bootcamp;
import Dominio.Curso;
import Dominio.Dev;
import Dominio.Mentoria;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Java", "Aprenda Java", 10);

        Curso curso2 = new Curso("Js", "Aprenda Js", 8);

        Mentoria mentoria = new Mentoria("Mentoria java", "Duvidas Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Java", "Aprenda java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev("João");
        Dev devSarah = new Dev("Sarah");

        devJoao.inscreverBootcamp(bootcamp);
        devSarah.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdo inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdo inscritos: " + devSarah.getConteudosInscritos());

        System.out.println("Conteúdo concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdo concluidos: " + devJoao.getConteudosConcluidos());

        devJoao.progredir();
        devSarah.progredir();

        System.out.println("Conteúdo concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdo concluidos: " + devJoao.getConteudosConcluidos());

        System.out.println("Conteúdo inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdo inscritos: " + devSarah.getConteudosInscritos());

        System.out.println(devJoao.calcularXp());
        System.out.println(devSarah.calcularXp());


    }

}
