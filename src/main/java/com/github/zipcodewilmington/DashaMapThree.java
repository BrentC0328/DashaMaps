package com.github.zipcodewilmington;

import MyLinkedList.MyNode;

public class DashaMapThree extends DashaMap{
    public DashaMapThree(){
        super();
    }

    private String hashFunctionThree(String input){
        if(input.length() > 1){
            return String.valueOf(Character.toLowerCase(input.charAt(0)) +
                    Character.toLowerCase(input.charAt(1)));
        }
        return null;
    }

    public void set(String key, Integer value){
        String keyHash = hashFunctionThree(key);
        int keyHashIndex = getBucketIndex(keyHash);
        doorDash[keyHashIndex].add(key, value);
    }

    public Integer get(String key){
        String keyHash = hashFunctionThree(key);
        int keyHashIndex = getBucketIndex(keyHash);
        MyNode result = doorDash[keyHashIndex].get(key);
        return result.getData().getValue();
    }

    public Integer delete(String key){
        String keyHash = hashFunctionThree(key);
        int keyHashIndex = getBucketIndex(keyHash);
        return doorDash[keyHashIndex].delete(key);
    }


}
