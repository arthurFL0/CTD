package Cursos;

public class CursoAdmin extends Curso {

    private static final CursoAdmin INSTANCE = new CursoAdmin();

    private CursoAdmin() {

    }

    public static CursoAdmin getINSTANCE() {
        return INSTANCE;
    }

}
