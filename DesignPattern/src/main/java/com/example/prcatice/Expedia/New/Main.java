package com.example.prcatice.Expedia.New;

import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Main {

    /*
    *
    * Design an in memory cache

- Should have the option to configure max cache size
- Should evict previous entries when the cache is full
- Should have the capability to provide different eviction strategies
- (Optional) Safe to use in a multi-threaded environment
*
* get and put inside cache--
* Key Value -- accepting
* max size --> evict
*
*
* Evict policy -- dynamically
*
*
* cache
*   HashMap<Key,Value> hm;
*   int size
* }
*
* Data
* Count
*
* Data
* count
* Evectionpolicy
*
*
*
*
    *
    * */

    interface EvictionPolicy{
        void doEviction(LinkedHashMap<String, String> hashMap);
    }

    static class LRU implements EvictionPolicy {

        @Override
        public void doEviction(LinkedHashMap<String, String> hashMap) {
            //LRU
           for (String key: hashMap.keySet()){
               System.out.println("Working Eviction Policy");
               System.out.println("removed Element : "+hashMap.get(key));
               hashMap.remove(key);

               return;
           }
        }
    }
    interface   CacheOperation{
         String get(String key);
         void put(String key, String value);
    }





    static class Cache implements CacheOperation{
        LinkedHashMap<String,String> hashMap = new LinkedHashMap<>();
        EvictionPolicy evictionPolicy ;

        int size;
        Cache(int size){
            this.size= size;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        void implementEviction(EvictionPolicy policy){
            this.evictionPolicy = policy;
        }

        @Override
        public String get(String key) {
            System.out.println("Get working");
            return hashMap.get(key);
        }

        @Override
        public void put(String key, String value) {
            if(hashMap.size()==size || hashMap.size()>size){
                evictionPolicy.doEviction((LinkedHashMap<String, String>) hashMap);
                hashMap.put(key,value);
            }else {

                hashMap.put(key,value);
                System.out.println("Value :"+hashMap.get(key));
            }

        }
    }


  /*  static class MainOrchestrator
    {
        Cache cache = new Cache();
        cache.put();
        cache.implementEvicetionPolicy(new LRU);
    }*/
    public static void main(String[] args) {
        int size = 4;
       Cache cache = new Cache(size);
       cache.put("inder","verma");
       cache.put("two","value2");
        cache.put("three","value3");
        cache.put("fopur","value4");
        cache.put("five","value5");

    }
}
