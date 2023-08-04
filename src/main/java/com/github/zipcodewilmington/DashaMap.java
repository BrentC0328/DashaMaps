package com.github.zipcodewilmington;

import MyLinkedList.MyLinkedList;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public abstract class DashaMap implements HashMapX{

    protected MyLinkedList[] doorDash;



    public DashaMap(){
        doorDash = new MyLinkedList[26];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++){
            doorDash[i] = new MyLinkedList("" + alphabet.charAt(i));
        }
    }
    @Override
    public void set(String key, Integer value) {


    }

    @Override
    public Integer delete(String key) {
        return null;
    }

    @Override
    public Integer get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {

        for(MyLinkedList list : this.doorDash){
            if(!list.isEmpty()){
                return false;
            }
        }
        return true;
    }

    @Override
    public Integer size() {
        Integer totalSize = 0;

        for (MyLinkedList listy : doorDash){
            totalSize += listy.size();
        }

        return totalSize;
    }

    @Override
    public Integer bucketSize(String key) {
        return doorDash[getBucketIndex(key)].size();
    }

    protected Integer getBucketIndex(String key){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return alphabet.indexOf(key);
    }

}
