class LRUCache {

    int cap;
    Map<Integer,Integer> map=new LinkedHashMap<>();
    Queue<Integer> q =new ArrayDeque<>();
    public LRUCache(int capacity) {
        cap=capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            q.remove(key);
            q.offer(key);
            return map.get(key);
        }
        else return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            q.remove(key);
            q.offer(key);
            map.put(key,value);
        }
        else{
            if(map.size()<cap){
                q.offer(key);
            }
            else{
                map.remove(q.poll());
                q.offer(key);
            }
            map.put(key,value);
        }
    }
}
