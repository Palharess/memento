import java.util.Stack;

class History {
    private final Stack<TextEditor.Memento> mementoStack = new Stack<>();

    public void saveState(TextEditor.Memento memento) {
        mementoStack.push(memento);
    }

    public TextEditor.Memento undo() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        }
        return null;
    }
}
