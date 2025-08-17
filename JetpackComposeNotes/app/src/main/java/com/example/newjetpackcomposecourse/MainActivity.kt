package com.example.newjetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.newjetpackcomposecourse.`14_ProgresIndicator`.CircularIndicatorEx
import com.example.newjetpackcomposecourse.`15_PulltoRefresh`.PulltoRefreshScreen
import com.example.newjetpackcomposecourse.`16_SearchBar`.SearchScreen
import com.example.newjetpackcomposecourse.`17_SegmentedButton`.SegmentedbuttonEx
import com.example.newjetpackcomposecourse.`18_Slider`.SliderEx
import com.example.newjetpackcomposecourse.`19_SnackBar`.SnackBArEX
import com.example.newjetpackcomposecourse.`20_Badges`.BadgeInteractiveExample
import com.example.newjetpackcomposecourse.`21_Switch`.SwitchEx
import com.example.newjetpackcomposecourse.`22_DatePicker`.DatePickerEx
import com.example.newjetpackcomposecourse.`23_TimePicker`.TimePickerEx
import com.example.newjetpackcomposecourse.`27_Animation`.AnimatedBox
import com.example.newjetpackcomposecourse.ui.theme.NewJetpackComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewJetpackComposeCourseTheme {



                   AnimatedBox()








            }
        }
    }
}
