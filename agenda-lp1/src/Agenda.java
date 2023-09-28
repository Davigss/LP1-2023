import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Agenda {
        private Map<String, List<Object>> agendar;

        public Agenda() {
            agendar = new HashMap<>();
        }

        public void addItem(String date, Object item) {
            agendar.computeIfAbsent(date, k -> new ArrayList<>()).add(item);
        }

        public void removerItem(String date, Object item) {
            if (agendar.containsKey(date)) {
                agendar.get(date).remove(item);
            }
        }

        public List<Object> pegarItensPorData(String date) {
            return agendar.getOrDefault(date, new ArrayList<>());
        }
        public void mudarItemData(Object item, String velhaData, String novaData) {
            removerItem(velhaData, item);
            addItem(novaData, item);
        }
        public void verItensPorData() {
            for (String date : agendar.keySet()) {
                List<Object> items = agendar.get(date);
                System.out.println("Data: " + date);
                for (Object item : items) {
                    System.out.println(item);
                }
                System.out.println();
            }
        }
    }