package com.example.bike_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bike_card.ui.theme.Bike_CardTheme
import com.example.bike_card.ui.theme.Purple1


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bike_CardTheme {
                Myscreen()
            }
        }
    }
}
@Composable
fun Myscreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()

    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxWidth()
                .padding(26.dp)
                .height(250.dp),
            backgroundColor = Purple1,
            elevation = 10.dp,
            shape = RoundedCornerShape(30.dp)

        ) {
            Column {
                Myrow1()
                MyRow2()
            }
        }
    }
}

@Composable
fun Myrow1() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
    )
    {

        Text(
            text = "Himalayan 450\n",
            fontSize = 25.sp,
            color = Color.White
        )

        Spacer(modifier = Modifier.padding(12.dp))

        Image(painter = painterResource(id = R.drawable.test2) ,

            contentDescription ="gdsc logo" )

    }
}

@Composable
fun MyRow2(){
    Row (
        verticalAlignment = Alignment.Bottom
    ){

        Image(painter = painterResource(id = R.drawable.test) ,

            contentDescription ="android logo" )

        Text(
            text="Buying This \nBeast in 2024",
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White,
            modifier = Modifier.padding(bottom = 16.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Bike_CardTheme {
        Myscreen()
    }
}