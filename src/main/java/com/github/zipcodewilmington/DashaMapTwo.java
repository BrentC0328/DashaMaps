package com.github.zipcodewilmington;

import MyLinkedList.MyNode;

public class DashaMapTwo extends DashaMap{

    public DashaMapTwo(){
        super();
    }

    private String hashFunctionTwo(String input){
        if(input.length() > 0){
            return String.valueOf(Character.toLowerCase(input.charAt(1)));
        }
        return null;
    }

    public void set(String key, Integer value){
        String keyHash = hashFunctionTwo(key);
        int keyHashIndex = getBucketIndex(keyHash);
        doorDash[keyHashIndex].add(key, value);
    }

    public Integer get(String key){
        String keyHash = hashFunctionTwo(key);
        int keyHashIndex = getBucketIndex(keyHash);
        MyNode result = doorDash[keyHashIndex].get(key);
        return result.getData().getValue();
    }

    public Integer delete(String key){
        String keyHash = hashFunctionTwo(key);
        int keyHashIndex = getBucketIndex(keyHash);
        return doorDash[keyHashIndex].delete(key);
    }

}
