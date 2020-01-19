package Triconsumer;
@FunctionalInterface
public interface triconsumerinterface<Type1, Type2, Type3> {
void accept(Type1 t1, Type2 t2, Type3 t3);
}
