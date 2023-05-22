package truong.exercise1000.util.core;

public interface ITransformer<T, V> {
    T transform(V input);
}
