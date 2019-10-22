package com.a2dict.a2dall.util;

import clojure.lang.RT;
import clojure.lang.Symbol;
import clojure.lang.Var;

/**
 * clojure interop utils
 */
public class ClojureUtil {
    public static final Var REQUIRE = var("clojure.core", "require");
    public static final Var LOAD = var("clojure.core", "load");
    /**
     * Set this flag to true (in debugger) to force reload.
     */
    public static boolean reload = false;

    public static Object require(String nsName) {
        if (reload) {
            return load("/" + nsName.replace(".", "/").replace("-", "_"));
        } else {
            return REQUIRE.invoke(Symbol.intern(nsName));
        }
    }

    public static Object load(String file) {
        return LOAD.invoke(file);
    }

    public static Var var(String nsName, String varName) {
        return RT.var(nsName, varName);
    }

    @SuppressWarnings("unchecked")
    public static <T> T loadAndCallFn(String namespace, String fn) {
        final Var mocked = loadFn(namespace, fn);
        return (T) mocked.invoke();
    }

    @SuppressWarnings("unchecked")
    public static <T> T loadAndCallFn(String namespace, String fn, Object arg1) {
        final Var mocked = loadFn(namespace, fn);
        return (T) mocked.invoke(arg1);
    }

    @SuppressWarnings("unchecked")
    public static <T> T loadAndCallFn(String namespace, String fn, Object arg1, Object arg2) {
        final Var mocked = loadFn(namespace, fn);
        return (T) mocked.invoke(arg1, arg2);
    }

    public static Var loadFn(String namespace, String fn) {
        require(namespace);
        return var(namespace, fn);
    }
}
