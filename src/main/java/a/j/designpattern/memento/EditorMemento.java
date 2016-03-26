package a.j.designpattern.memento;

/**
 * Created by anjun on 3/26/16.
 */
//Memento
public class EditorMemento {
    private final String editorState;
    public EditorMemento(String state) {
        editorState = state;
    }
    public String getSavedState() {
        return editorState;
    }
}