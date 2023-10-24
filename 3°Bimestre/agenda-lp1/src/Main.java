public class Main {
        public static void main(String[] args) {

            Pessoa pessoa1 = new Pessoa("Fernando Freitas", "freitax.lira@gmail.com");
            Pessoa pessoa2 = new Pessoa("Gabriel Rocha", "gmr.rocha@gmail.com");


            Agenda FernadoAgenda = new Agenda();
            Agenda GabrielAgenda = new Agenda();

            Evento evento1 = new Evento("Reunião", "2023-09-28", pessoa1);
            Tarefa tarefa1 = new Tarefa("Ir na Academia", "2023-09-29", pessoa1);
            Lembrete lembrete1 = new Lembrete("Ouvir o novo álbum da Marina Sena", "2023-09-30", pessoa1);

            Evento evento2 = new Evento("Conferência", "2023-09-28", pessoa2);
            Tarefa tarefa2 = new Tarefa("Lição de LP1", "2023-09-29", pessoa2);
            Lembrete lembrete2 = new Lembrete("Colocar o lixo na rua", "2023-09-30", pessoa2);

            FernadoAgenda.addItem("2023-09-18", evento1);
            FernadoAgenda.addItem("2023-09-19", tarefa1);
            FernadoAgenda.addItem("2023-09-20", lembrete1);

            GabrielAgenda.addItem("2023-09-18", evento2);
            GabrielAgenda.addItem("2023-09-19", tarefa2);
            GabrielAgenda.addItem("2023-09-20", lembrete2);

            System.out.println("Agenda de Fernando:");
            FernadoAgenda.verItensPorData();

            System.out.println("Agenda de Gabriel:");
            GabrielAgenda.verItensPorData();

            FernadoAgenda.mudarItemData(tarefa1, "2023-09-19", "2023-10-01");

            System.out.println("Agenda de Fernando atualizada:");
            FernadoAgenda.verItensPorData();
        }
    }