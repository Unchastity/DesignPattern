package com.jimg.observe;

public interface Subject {
    public void registerObserve(Observe o);
    public void removeObserve(Observe o);
    public void notifyAllObserves();
}
