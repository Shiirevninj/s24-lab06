package edu.cmu.cs.cs214.rec04;


public class DelegationSortedIntList implements IntegerList {
    private final SortedIntList sortedList = new SortedIntList(); 

    private int totalAdded = 0;  

  
    @Override
    public boolean add(int num) {
        boolean success = sortedList.add(num); 
        if (success) {
            totalAdded++; 
        }
        return success;
    }

    
    @Override
    public boolean addAll(IntegerList list) {
        boolean success = sortedList.addAll(list); 
        if (success) {
            totalAdded += list.size(); 
        }
        return success;
    }


    @Override
    public int get(int index) {
        return sortedList.get(index);
    }


    @Override
    public boolean remove(int num) {
        boolean success = sortedList.remove(num);
        return success;
    }


    @Override
    public boolean removeAll(IntegerList list) {
        boolean success = sortedList.removeAll(list);
        return success;
    }


    @Override
    public int size() {
        return sortedList.size(); 
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}