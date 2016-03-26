package a.j.designpattern.memento;

/**
 * Created by anjun on 3/26/16.
 */
//Originator
public class Editor {
    //state
    public String editorContents;
    public void setState(String contents) {
        this.editorContents = contents;
    }
    public EditorMemento save() {
        return new EditorMemento(editorContents);
    }
    public void restoreToState(EditorMemento memento) {
        editorContents = memento.getSavedState();
    }
}