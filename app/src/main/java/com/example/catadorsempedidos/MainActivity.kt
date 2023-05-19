package com.example.catadorsempedidos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.content.Intent
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.catadorsempedidos.ui.theme.CatadorSemPedidosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatadorSemPedidosTheme() {
                setContent {
                    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
                        Image(
                            painter = painterResource(R.drawable.imagem_fundo),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )
                        Greeting("android")
                    }
                }
            }
        }
    }

    @Composable
    fun Greeting(name: String) {

        Box(Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(R.drawable.imagem_fundo),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
            )
            {


                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
                {

                    Card(
                        modifier = Modifier
                            .width(320.dp)
                            .height(320.dp)
                            .padding(start = 25.dp, end = 25.dp,),
                        shape = RoundedCornerShape(20.dp),
                        backgroundColor = Color(255, 255, 255)
                    )
                    {

                        Image(
                            painter = painterResource(R.drawable.imagem_fundo_card),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)
                        {
                            Text(
                                modifier = Modifier.padding(),
                                textAlign = TextAlign.Center,
                                text = "Você não possui nenhum chamado",
                                fontSize = 22.sp,
                                color = Color.Black
                            )
                            Image(
                                painter = painterResource(R.drawable.foto_recycle),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(180.dp)
                                    .padding(top = 20.dp),

                                )


                        }
                    }
                }
            }

        }



    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        CatadorSemPedidosTheme {
            Greeting("Android")
        }
    }
}