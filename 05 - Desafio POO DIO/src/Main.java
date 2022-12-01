import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição Curso Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJavaScript = new Curso();
        cursoJavaScript.setTitulo("Curso JavaScript");
        cursoJavaScript.setDescricao("Descrição Curso JavaScript");
        cursoJavaScript.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());
        
    }
}
