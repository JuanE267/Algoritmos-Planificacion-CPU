public class Proceso {

    private String nombre;
    private int Tllegada;
    private int Tservicio;
    private int Trestante;

    private int Tfinalizacion = 0;
    private int Tretorno = 0;
    private int Tespera = 0;

    public Proceso(String nombre, int Tllegada, int Tservicio){
        this.nombre = nombre;
        this.Tllegada = Tllegada;
        this.Tservicio = Tservicio;

        this.Trestante = Tservicio;
    }

    public void calcularTiempos(){
        Tretorno = Tfinalizacion - Tllegada;
        Tespera = Tretorno - Tservicio;
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                ", Tllegada=" + Tllegada +
                ", Tservicio=" + Tservicio +
                ", Tfinalizacion=" + Tfinalizacion +
                ", Tretorno=" + Tretorno +
                ", Tespera=" + Tespera +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTllegada() {
        return Tllegada;
    }

    public void setTllegada(int tllegada) {
        Tllegada = tllegada;
    }

    public int getTservicio() {
        return Tservicio;
    }

    public void setTservicio(int tservicio) {
        Tservicio = tservicio;
    }

    public int getTrestante() {
        return Trestante;
    }

    public void setTrestante(int trestante) {
        Trestante = trestante;
    }

    public int getTfinalizacion() {
        return Tfinalizacion;
    }

    public void setTfinalizacion(int tfinalizacion) {
        Tfinalizacion = tfinalizacion;
    }

    public int getTretorno() {
        return Tretorno;
    }

    public void setTretorno(int tretorno) {
        Tretorno = tretorno;
    }

    public int getTespera() {
        return Tespera;
    }

    public void setTespera(int tespera) {
        Tespera = tespera;
    }
}
