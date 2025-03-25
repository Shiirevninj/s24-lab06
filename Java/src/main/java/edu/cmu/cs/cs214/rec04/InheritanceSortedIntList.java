package edu.cmu.cs.cs214.rec04;


public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded = 0; 

    @Override
    public boolean add(int num) {
        boolean success = super.add(num); 
        if (success) {
            totalAdded++; 
        }
        return success;
    }

 
    @Override
    public boolean addAll(IntegerList list) {
        int countBefore = totalAdded;
        
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
        
        return totalAdded > countBefore;
    }    

    public int getTotalAdded() {
        return totalAdded;
    }
}