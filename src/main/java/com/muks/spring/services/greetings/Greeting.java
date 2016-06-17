package com.muks.spring.services.greetings;

/**
 * Created by 15692 on 17/06/16.
 * Modeling the greeting representation using pojo
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
