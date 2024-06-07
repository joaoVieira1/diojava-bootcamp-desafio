package Dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria){
        setDescricao(descricao);
        setTitulo(titulo);
        setCargaHoraria(cargaHoraria);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHoraria();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                '}';
    }

}
