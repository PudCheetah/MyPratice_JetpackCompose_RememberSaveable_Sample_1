package com.example.mypratice_jetpackcompose_remembersaveable_sample_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


//HackMD筆記位置: https://hackmd.io/@9YAtszqXS2OLNZOrLY_-Jg/Android_JetpackCompose_5

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            PointScreen()
        }
    }
}

@Composable
fun PointScreen(){
    var point by rememberSaveable(stateSaver = PointDataClassUtils.pointSaver) { mutableStateOf(PointDataClass(10, 20)) }
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "x: ${point.x}, y: ${point.y}")
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { point = point.copy(x = point.x + 1) }) {
            Text("Increase x")
        }
    }
}


@Preview
@Composable
fun Preview(){
    PointScreen()
}