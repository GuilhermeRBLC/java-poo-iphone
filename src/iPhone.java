public class iPhone implements ReprodutorMusicalInterface, AparelhoTelefonicoInterface, NavegadorDeInternetInterface {

    @Override
    public void ligar() {
        System.out.println("iPhone: ligar");
    }

    @Override
    public void atender() {
        System.out.println("iPhone: atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iPhone: iniciarCorreioVoz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("iPhone: exibirPagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("iPhone: adicionarNovaAba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("iPhone: atualizarPagina");
    }

    @Override
    public void tocar() {
        System.out.println("iPhone: tocar");
    }

    @Override
    public void pausar() {
        System.out.println("iPhone: pausar");
    }

    @Override
    public void selecionarMusica(Integer id) {
        System.out.println("iPhone: selecionarMusica");
    }
}
