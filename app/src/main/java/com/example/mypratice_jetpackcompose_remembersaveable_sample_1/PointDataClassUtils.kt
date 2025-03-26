package com.example.mypratice_jetpackcompose_remembersaveable_sample_1

import androidx.compose.runtime.saveable.Saver


object PointDataClassUtils{
    val pointSaver = Saver<PointDataClass, List<Int>>(
        save = {point -> listOf(point.x, point.y) },
        restore = { list -> PointDataClass(list[0], list[1])}
    )
}