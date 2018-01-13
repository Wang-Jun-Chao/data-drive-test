package wjc.ddt.util;

import wjc.ddt.exception.DdtException;

import java.lang.reflect.Method;

/**
 * Author: 王俊超
 * Date: 2018-01-13 11:52
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public class MethodCaller {

    public Object call(String methodName, Object[] args, Object target) {
        Class<?> clazz = target.getClass();


        Class<?>[] parameterTypes = null;

        if (args != null && args.length > 0) {
            parameterTypes = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                parameterTypes[i] = args[i].getClass();
            }
        }

        Object result;
        try {
            Method method = clazz.getMethod(methodName, parameterTypes);
            result = method.invoke(target, args);
        } catch (Exception e) {
            throw new DdtException(e);
        }

        return result;
    }
}
