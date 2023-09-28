public class Lembrete {
    private String mensagem;
    private String data;
    private Pessoa pessoa;

    public Lembrete(String message, String date, Pessoa person) {
        this.mensagem = message;
        this.data = date;
        this.pessoa = person;
    }

    // Getter methods

    @Override
    public String toString() {
        return "Lembrete - Menssagem: " + mensagem + ", Data: " + data + ", Pessoa: " + pessoa.getName();
    }
}
