package com.example.rolarimagem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rolarimagem.ui.theme.RolarimagemTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RolarimagemTheme {
                rolarimagem()
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun rolarimagem() {
    var resultado by remember { mutableStateOf(1) }
    var idImagem = when (resultado) {
        1 -> R.drawable.africatwin
        2 -> R.drawable.mt10
        else -> R.drawable.bmw1200
    }

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = idImagem),
            contentDescription = null,
            contentScale = ContentScale.FillHeight
        )

        Row(
        ) {
            Button(
                onClick = {
                    resultado = (1..3).random()
                }
            ) {
                Text(
                    text = "Anterior",
                    fontSize = 30.sp,
                    color = Color.Black
                )
            }
            Button(
                onClick = {
                    resultado = (1..3).random()
                }
            ) {
                Text(
                    text = "Avançar",
                    fontSize = 30.sp,
                    color = Color.Black
                )
            }
        }
    }
}
