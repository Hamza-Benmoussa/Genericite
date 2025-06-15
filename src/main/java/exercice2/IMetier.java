package exercice2;

import java.util.List;

public interface IMetier<T> {

    void add(T o);

    int getSize();

    List<T> getAll();

    T findById(long id);

    void delete(long id);
}

