package com.github.j1v37u2k3y.pastemarkdownimage.services

import com.github.j1v37u2k3y.pastemarkdownimage.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
