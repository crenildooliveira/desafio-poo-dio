import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargahoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargahoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}