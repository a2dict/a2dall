package com.a2dict.a2dall;

import com.a2dict.a2dall.util.ClojureUtil;
import org.junit.jupiter.api.Test;

/**
 * Created by a2dict on 2019/10/22
 */
public class ClojureUtilTest {
    @Test
    public void testCall() {
        String hello = ClojureUtil.loadAndCallFn("a2dall.core", "hello");
        System.out.println(hello);
    }
}
