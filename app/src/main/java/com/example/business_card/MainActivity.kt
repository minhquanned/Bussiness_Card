package com.example.business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.business_card.ui.theme.Business_cardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Business_cardTheme {
                BusinessCard("Android")
            }
        }
    }
}

@Composable
fun BusinessCard(name: String, modifier: Modifier = Modifier) {
    val background = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = background,
            contentDescription = null,
            contentScale = ContentScale.FillHeight
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painterResource(id = R.drawable.logo_2021_nho),
                contentDescription = "Logo UED",
                modifier
                    .width(150.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = name,
                color = Color.Red,
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Title",
                color = Color.Blue,
                fontSize = 30.sp,
                fontStyle = FontStyle.Italic
            )
            Spacer(modifier = Modifier.height(40.dp))
            Column(
                modifier
                    .fillMaxWidth()
                    .padding(bottom = 50.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column {
                    Row {
                        Icon(
                            Icons.Rounded.Call,
                            contentDescription = "Phone",
                            tint = Color.DarkGray
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "+8496 727 6961",
                            fontSize = 18.sp
                        )
                    }
                    Row {
                        Icon(
                            Icons.Rounded.Send,
                            contentDescription = "Facebook",
                            tint = Color.DarkGray
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "@letmecook",
                            fontSize = 18.sp
                        )
                    }
                    Row {
                        Icon(
                            Icons.Rounded.Email,
                            contentDescription = "Mail",
                            tint = Color.DarkGray
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "minhquan4so9@gmail.com",
                            fontSize = 18.sp
                        )
                    }
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Business_cardTheme {
        BusinessCard("Quan Ha")
    }
}