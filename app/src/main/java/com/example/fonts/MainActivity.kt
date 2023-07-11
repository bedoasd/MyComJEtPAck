package com.example.fonts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ScaleFactor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fonts.ui.theme.FontsTheme
import org.w3c.dom.DOMStringList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Box(modifier = Modifier
                .fillMaxSize(.5f)
                .padding(16.dp)){
                var painter= painterResource(id = R.drawable.kermit)
                var imageDescription ="Kermit Image"
                var titel="Kermit Playing In the Snow "
                ImageCard(painter = painter, imageDescription =imageDescription , title =titel )

            }

        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    imageDescription:String,
    title:String,
    modifier: Modifier= Modifier
){

    Card(
        modifier = Modifier.fillMaxWidth()
            , shape = RoundedCornerShape(15.dp)
    ) {
        Box(
            modifier = Modifier
                .height(200.dp)
                .fillMaxSize()
        ) {
         Image(painter = painter, contentDescription = imageDescription , contentScale = ContentScale.Crop)


            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent, Color.Black
                        ), startY = 300f
                    )
                ))


            Box(modifier =Modifier.fillMaxSize().padding(16.dp),contentAlignment = Alignment.BottomStart ){
                Text(text = title , style = TextStyle(color = Color.White))
                //testOne
                //testtwo
            }

        }

    }

}


