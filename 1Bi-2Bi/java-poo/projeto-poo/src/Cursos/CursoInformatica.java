package Cursos;


public class CursoInformatica extends Curso {

    private static final CursoInformatica INSTANCE = new CursoInformatica();

    private CursoInformatica() {

    }

    public static CursoInformatica getINSTANCE() {

        return INSTANCE;
    }

}
