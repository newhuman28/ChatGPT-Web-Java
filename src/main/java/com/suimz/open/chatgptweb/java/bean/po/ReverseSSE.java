package com.suimz.open.chatgptweb.java.bean.po;

public class ReverseSSE {
    private static final String DONE_DATA = "[DONE]";

    private final String data;

    public ReverseSSE(String data){
        this.data = data;
    }

    public String getData(){
        return this.data;
    }

    public byte[] toBytes(){
        return String.format("data: %s\n\n", this.data).getBytes();
    }

    public boolean isDone(){
        return DONE_DATA.equalsIgnoreCase(this.data);
    }
}
