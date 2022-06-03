class RandomizedSet {
     HashMap<Integer,Integer> valueIndexMap;
     ArrayList<Integer> values;
 
    public RandomizedSet() {
        valueIndexMap=new HashMap<>();
        values=new ArrayList<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
       if(valueIndexMap.containsKey(val)) return false;
        values.add(val);
        valueIndexMap.put(val,values.size()-1);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!valueIndexMap.containsKey(val)) return false;
        int idx=valueIndexMap.get(val);            //idx of value to be deleted
        if(idx==values.size()-1){
            valueIndexMap.remove(val);
             values.remove(values.size()-1);
            return true;
        }
        
        int lastValue=values.get(values.size()-1);  //last value
        valueIndexMap.remove(val);                 
        valueIndexMap.put(lastValue,idx);
     
        Collections.swap(values,idx,values.size()-1);
        values.remove(values.size()-1);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random rand=new Random();
        int random=rand.nextInt(values.size());
        return values.get(random);
    } 
}
