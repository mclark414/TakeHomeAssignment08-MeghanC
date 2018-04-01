package com.example.android.todolist;


public class Task {
    public int priority;
    public int toDo;
    public int photoId;
    public int emojiId;

    public Task(int priority, int toDo, int photoId, int emojiId) {
        this.priority = priority;
        this.toDo = toDo;
        this.photoId = photoId;
        this.emojiId = emojiId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getToDo() {
        return toDo;
    }

    public void setToDo(int toDo) {
        this.toDo = toDo;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getEmojiId() {
        return emojiId;
    }

    public void setEmojiId(int done) {
        emojiId = done;
    }
}
