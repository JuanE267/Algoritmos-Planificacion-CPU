import java.util.Comparator;
import java.util.List;


public class FCFS {
    // FIRST COME FIRST SERVE

    public static int inicio;
    public static int fin;
    public static int reloj = 0;

    public static void ejecutar(List<Proceso> procesos){

        Comparator<Proceso> porTllegada = (p1, p2) ->
                Integer.compare(p1.getTllegada(), p2.getTllegada());

        List<Proceso> procesosOrdenados = procesos;
        procesosOrdenados.sort(porTllegada);

        for(Proceso proc : procesosOrdenados){
            inicio = Math.max(reloj, proc.getTllegada());
            fin = inicio + proc.getTservicio();
            proc.setTfinalizacion(fin);
            reloj = fin;
            proc.calcularTiempos();
        }


    }
}
