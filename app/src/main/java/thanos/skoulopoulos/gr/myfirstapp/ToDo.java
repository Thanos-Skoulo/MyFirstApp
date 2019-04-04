package thanos.skoulopoulos.gr.myfirstapp;

public class ToDo {

    String title;
    String description;
    boolean isDone;

    public ToDo(String title, String description, boolean isDone){

        setTitle(title);
        setDescription(description);
        setIsDone(isDone);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean isDone){
        this.isDone = isDone;
    }
}
