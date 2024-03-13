package ru.inno.task;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheHandler<T> implements InvocationHandler {
    private T currentObject;
    private Map<Method, Object> results = new HashMap<>();

    public CacheHandler(T currentObject) {
        this.currentObject = currentObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("It works");
        Object objectResult;
        Method currentMethod;

        currentMethod = currentObject.getClass().getMethod(method.getName(), method.getParameterTypes());

        if (currentMethod.isAnnotationPresent(Cache.class)) {
            if (results.containsKey(currentMethod)) {
                System.out.println("  -> Cache");
                return results.get(currentMethod);
            }
            objectResult = method.invoke(currentObject, args);
            results.put(currentMethod, objectResult);
            System.out.println("  -> method.invoke");
            return objectResult;
        }
        if (currentMethod.isAnnotationPresent(Mutator.class)) {
            System.out.println("  -> Mutator");
            results.clear();
        }
        return method.invoke(currentObject, args);
    }
}