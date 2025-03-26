package com.example.mypratice_jetpackcompose_remembersaveable_sample_1

import androidx.compose.runtime.saveable.Saver


object PointDataClassUtils{
    //定義一個 Saver，將 PointDataClass 轉換成一個包含 x 與 y 的 List，再從 List 還原回 Point。
    // 自訂 Saver：將 PointDataClass 轉換成 List<Int> 儲存，並從 List 還原
    val pointSaver = Saver<PointDataClass, List<Int>>(
        save = {point -> listOf(point.x, point.y) },
        restore = { list -> PointDataClass(list[0], list[1])}
    )
}