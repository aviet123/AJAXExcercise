package service;

public interface IService<T> {

    Iterable<T> findAll();
    T findById(Long id);
    void update(T model);
    void save(T model);
    void remove(Long id);
}
