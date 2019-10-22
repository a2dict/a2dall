package com.a2dict.a2dall

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Created by zhangmd on 2019/10/22
 */
@SpringBootApplication
open class AppRun


fun main(args: Array<String>) {
    runApplication<AppRun>(*args)
}
