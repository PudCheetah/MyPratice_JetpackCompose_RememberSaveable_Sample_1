package com.example.mypratice_jetpackcompose_remembersaveable_sample_1

//假設我們有一個自訂的Dataclass，因為 PointDataClass 並非基本型別，我們需要自訂一個 Saver 來告訴 Compose 如何保存與還原它。
data class PointDataClass(val x: Int, val y: Int)
