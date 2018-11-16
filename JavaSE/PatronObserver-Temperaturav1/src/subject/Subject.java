package subject;

import observer.Observer;

/**
 *
 * @author Antonio
 */
public interface Subject {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}

