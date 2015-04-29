package ru.avsidorov.restapitemplate.Models;

/**
 * Created by Alexandr Sidorov on 29.04.2015.
 */
import com.google.gson.annotations.Expose;


public class Talk {

    @Expose
    private Talks_ talk;

    /**
     *
     * @return
     * The talk
     */
    public Talks_ getTalk() {
        return talk;
    }

    /**
     *
     * @param talk
     * The talk
     */
    public void setTalk(Talks_ talk) {
        this.talk = talk;
    }

}
