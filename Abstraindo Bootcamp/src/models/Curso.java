package models;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

   public Curso() {

   }
   
    public int getCargaHorario() {
        return cargaHoraria;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHoraria = cargaHorario;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                "}\n";
    }

    

    
}
