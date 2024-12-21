//originator
public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Cria um Memento para guardar o estado autal
    public Memento save() {
        return new Memento(text);
    }

    // Restaura o estado interno
    public void restore(Memento memento) {
        this.text = memento.getState();
    }

    // Classe aninhada que representa o Memento
    public static class Memento {
        private final String state;

        private Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }
    }
}
