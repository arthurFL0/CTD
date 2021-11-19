package Cursos;

public class CursoIngles extends Curso {

    private static final CursoIngles INSTANCE = new CursoIngles();

    private CursoIngles() {

    }

    public static CursoIngles getINSTANCE() {

        return INSTANCE;
    }

}
