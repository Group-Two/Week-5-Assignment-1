public abstract class AbstractQueue<T> {
    public abstract T dequeue();
    public abstract T enqueue(T obj, int priority);
    public abstract boolean isEmpty();
}
