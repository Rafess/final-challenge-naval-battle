package com.letscode.navalbattle.entities;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Function;

public class ExceptionHandler {

//    public static Object validateThis(Object classOrigin, Function<Object... , Object> classMethod, Object... args){
//        Object result = new Object();
//        if(classOrigin
//
//
//
//        return null;
//    }
//
//    private static Object executeFunction(Function<>){
//
//    }

//    public static Object validateThis(Object... args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Object result = null;
//        Object initialClass = args[0];
//        Object initialMethod = args[1];
//        Method method = initialClass.getClass().getMethod("<initialMethod>");
//        if(args.length > 2){
//            Object[] parameters = new Object[args.length-2];
//            System.arraycopy(args, 2, parameters,0, parameters.length);
//            result = method.invoke(initialClass, parameters);
//        } else {
//            result = method.invoke(initialClass);
//        }
//        return result;
//    }

    public static Object validateThis(Object method){
        String retry = "y";
        Object result = null;
        while (retry.equals("y")){
                result = method;
                if (!(result instanceof Exception)){
                    retry = "n";
                }
                validateThis(method);
            }
        return result;
    }

    public static String teste(int i) {
        System.out.println("cu");
        return "cu";
    }

    public static String teste(int i, int j){
        System.out.println("teste com 2 parametros");
        return "";
    }

    public static String teste(){
        System.out.println("teste sem parâmetros");
        return "lalala";
    }
}
