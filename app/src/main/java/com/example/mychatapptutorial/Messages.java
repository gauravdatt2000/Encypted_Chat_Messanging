package com.example.mychatapptutorial;

public class Messages {

    String message;
    String senderId;
    String receiverId;
    long timestamp;
    String currenttime;


    public Messages() {
    }


    public Messages(String message, String senderId , String receiverId, long timestamp, String currenttime) {
        this.message = message ;
        this.senderId = senderId ;
        this.receiverId = receiverId ;
        this.timestamp = timestamp ;
        this.currenttime = currenttime ;
    }

    public String getMessage() {
        return message;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getCurrenttime() {
        return currenttime;
    }

    public void setCurrenttime(String currenttime) {
        this.currenttime = currenttime;
    }
}
