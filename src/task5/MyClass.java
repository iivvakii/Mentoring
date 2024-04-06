package task5;

@FunctionalInterface
public interface MyClass<T,R> {
    R accept(T t);

}
