package com.github.yuxiangxin.atransplugin.services

import com.github.yuxiangxin.atransplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
