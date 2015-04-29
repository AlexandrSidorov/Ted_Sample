package ru.avsidorov.restapitemplate.Models;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Alexandr Sidorov on 29.04.2015.
 */


public class ResponseTalks implements Serializable {

    @Expose
    private List<Talk> talks;
    @Expose
    private Counts counts;

    /**
     * @return The talks
     */
    public List<Talk> getTalks() {
        return talks;
    }

    /**
     * @param talks1 The talks
     */
    public void setTalks(List<Talk> talks1) {
        this.talks=talks1;
    }

    /**
     * @return The counts
     */
    public Counts getCounts() {
        return counts;
    }

    /**
     * @param counts The counts
     */
    public void setCounts(Counts counts) {
        this.counts = counts;
    }




    public class Talk implements Serializable{

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

}



