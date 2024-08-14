package ch007.generics2;

public interface IEntityRepository<T> {
    void add(T entity);

    void delete(T entity);

    void update(T entity);
}
