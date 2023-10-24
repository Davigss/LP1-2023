public class Tarefa {
        private String titulo;
        private String data;
        private boolean completo;
        private Pessoa pessoa;

        public Tarefa(String title, String date, Pessoa person) {
            this.titulo = title;
            this.data = date;
            this.pessoa = person;
            this.completo = false;
        }

        public void MarcarCompleto() {
            this.completo = true;
        }

        @Override
        public String toString() {
            String status = completo ? "Completo" : "Incompleto";
            return "Tarefa - Titulo: " + titulo + ", Data: " + data + ", Pessoa: " + pessoa.getName() + ", Status: " + status;
        }
    }

