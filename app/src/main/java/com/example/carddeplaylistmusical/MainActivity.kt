package com.example.carddeplaylistmusical

import android.content.res.ColorStateList
import android.os.Bundle
import android.text.style.LineHeightSpan.WithDensity
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CarddePlaylistMusical.R
import com.example.carddeplaylistmusical.ui.theme.CarddePlaylistMusicalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarddePlaylistMusicalTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(
        color = Color(0xFF121212),
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding(),)
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center)
        {
            Surface( modifier = Modifier
                .width(400.dp)
                .height(400.dp)
                .shadow(elevation = 12.dp)
                .padding(24.dp)  ,
                     color = Color(0xFF1E1E1E),
                     shape = RoundedCornerShape(20.dp)

            )
        {
                Column(
                    modifier = Modifier.padding(24.dp)

                ) {
                   Image(
                      painter = painterResource(id = R.drawable.kurt),
                       contentDescription = "top",
                       modifier = Modifier
                           .size(80.dp)
                           .align(Alignment.CenterHorizontally)
                           .padding(bottom = 16.dp)
                   )
                    Text(text = "Coding Beats", fontSize = (26.sp),
                        fontWeight = FontWeight.Bold,
                        color=Color.White,
                        textAlign = TextAlign.Center
                        )
                    Text( text = "por Dev Studio",
                        fontSize = (14.sp),
                        color =Color.LightGray,
                        )
                    Row (
                        Modifier.fillMaxWidth(),
                        Arrangement.SpaceBetween
                    ) {
                        Text(text = "45 músicas", fontSize = (16.sp), fontWeight = FontWeight.Bold,color= Color.White)
                        Text(text = "2h 30min", fontSize = (16.sp),fontWeight = FontWeight.Bold,color = Color(0xFF1DB954))

                    }
                    Text(text ="A trilha sonora perfeita para programar com foco e produtividade.",
                        fontSize = (14.sp),
                        color = Color.Gray,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 24.dp)
                    )
                    Button(onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF1DB954),

                        )
                    ) {
                        Text(text = "OUVIR AGORA")

                    }
                }

        }

        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarddePlaylistMusicalTheme {
        Greeting("Android")
    }
}