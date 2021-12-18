package com.github.vinas8.myawesomeplugin.services

import com.intellij.openapi.project.Project
import com.github.vinas8.myawesomeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
