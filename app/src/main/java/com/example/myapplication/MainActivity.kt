package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.PurpleGrey40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){

                }

            }
        }
    }
}
@Composable
fun RecipeHome(){
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(painter = painterResource(id = R.drawable.recipehome), contentDescription = null, contentScale = ContentScale.FillBounds )

    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(top = 250.dp, start = 20.dp, end = 20.dp, bottom = 25.dp)
    ) {
        HeaderIcon()
        Heading()
        HeaderText()
        HeaderButtons()

}
}
@Composable
fun HeaderIcon(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.recipelogo), contentDescription = null,
            Modifier
                .width(width = 90.dp)
                .height(height = 90.dp))

    }


}
@Composable
fun Heading(){
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Tasty Recipes",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 10.dp),
            color = Color.Black,
            fontStyle = FontStyle.Italic,
        )

    }

}
@Composable
fun HeaderText(){
    Text(text = "Welcome to Our online food recipe platform.Enjoy our different types of delicacies originated from different parts of the world.Get a taste of different cultures",
        textAlign = TextAlign.Center,
        fontSize = 18.sp,
        fontWeight = FontWeight.ExtraBold,
        color = Color.White,
        modifier = Modifier.padding(start = 20.dp, bottom = 25.dp)
        )
}
@Composable
fun HeaderButtons(
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = {  }, modifier = Modifier
            .width(200.dp)
            .padding()) {
            Text(text = "Get Started")

        }
    }


}
@Preview(showBackground = true,heightDp=800, widthDp=390,)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        RecipeHome()
    }
}