public class Evento {
        private String titulo;
        private String data;
        private Pessoa pessoa;

        public Evento(String title, String date, Pessoa person) {
            this.titulo = title;
            this.data = date;
            this.pessoa = person;
        }

        @Override
        public String toString() {
            return "Evento - Titulo: " + titulo + ", Data: " + data + ", Pessoa: " + pessoa.getName();
        }
    }
