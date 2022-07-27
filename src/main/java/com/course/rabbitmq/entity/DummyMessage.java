package com.course.rabbitmq.entity;

public class DummyMessage {

    private String content;
    private int publishOrder;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPublishOrder() {
        return publishOrder;
    }

    public void setPublishOrder(int publishOrder) {
        this.publishOrder = publishOrder;
    }

    public DummyMessage() {
    }

    public DummyMessage(String content, int publishOrder) {
        this.content = content;
        this.publishOrder = publishOrder;
    }
}
