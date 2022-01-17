package ru.danilsibgatyllin.behavioral.memento;

public class Editor {
    protected StringBuilder sb = new StringBuilder();

    public Editor() {
        sb.append("");
    }

    public void type(String words){
        this.sb.append(" ");
        this.sb.append(words);
    }

    public String getContent(){
        return sb.toString();
    }

    public EditorMemento save(){
        return new EditorMemento(this.getContent());
    }

    public void restore(EditorMemento memento){
        this.sb = new StringBuilder(memento.getContent());
    }


}
