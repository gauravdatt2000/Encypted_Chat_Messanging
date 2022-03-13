package com.example.mychatapptutorial;

public class KeyGen {

    public  String generatekey(String  SenderOrReceiverId , Long timestamp ){
        return new String( SenderOrReceiverId + "@@" + Long.toString(timestamp) ) ;
    }

}