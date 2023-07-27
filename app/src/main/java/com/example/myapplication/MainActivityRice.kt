package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivityRice : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun RiceHome(){
    Column(
        modifier=Modifier.padding(top = 20.dp,)
    ) {
        RicePageTitle()
        RiceCard()
    }
}
@Composable
fun RicePageTitle(
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, bottom = 15.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null )
            Text(text = "Back", modifier = Modifier.padding(start = 10.dp))
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        }


    }
}

@Composable
fun RiceCard()
{
    androidx.compose.material3.Card(
        modifier = Modifier
            .size(160.dp)
            .background(color = Color.DarkGray)
            .fillMaxWidth()

    ) {
        Image(
            painter = painterResource(id = R.drawable.rice),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillHeight
        )
    }

    androidx.compose.material3.Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(top = 20.dp),
    ) {
        Column(
            modifier = Modifier.padding(top = 10.dp, start = 10.dp)
        ) {
            Text(text = "Fried Rice", fontSize = 25.sp, fontWeight = FontWeight.Bold,)
            Row(
                modifier = Modifier.padding(top = 2.dp)
            ) {
                Icon(imageVector = Icons.Default.Star, contentDescription = null,)
                Icon(imageVector = Icons.Default.Star, contentDescription = null)
                Icon(imageVector = Icons.Default.Star, contentDescription = null)
                Icon(imageVector = Icons.Default.Star, contentDescription = null)

                Text(text = "4.5", modifier = Modifier.padding(top = 2.dp, start = 5.dp))

            }
            Row() {
                Text(
                    text = "Meal Type:",
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(top = 2.dp)
                )
                Text(text = "Lunch Dinner", modifier = Modifier.padding(top = 2.dp, start = 5.dp))

            }
            Row() {
                Text(
                    text = "Serving:",
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(top = 2.dp)
                )
                Text(text = "5", modifier = Modifier.padding(top = 2.dp, start = 5.dp))
            }
            Row() {
                Text(
                    text = "Difficulty Level:",
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(top = 2.dp)
                )
                Text(text = "Intermediary", modifier = Modifier.padding(top = 2.dp, start = 5.dp))

            }
        }
        LazyColumn(content = {
            item {
                Column(
                    modifier = Modifier.padding(top = 15.dp, start = 10.dp)
                ) {
                    Text(text = "Ingredients", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
                    Text(text = "250g cooked basmati rice")
                    Text(text = "1 tsp sugar")
                    Text(text = "2 tsp dark soy sauce, plus extra to serve")
                    Text(text = "small knob of ginger, grated")
                    Text(text = "1 garlic clove, crushed")
                    Text(text = "200g frozen peas")
                    Text(text = "175g mushrooms, sliced")
                    Text(text = "2 rashers bacon, chopped")
                    Text(text = "1 egg, beaten")
                    Text(text = "2 tsp oil")

                }
            }
            item {
                Column(
                    modifier = Modifier.padding(top = 15.dp, start = 10.dp, end = 10.dp)
                ) {
                    Text(
                        text = "Direction Steps",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Column() {
                        Text(text = "Step 1", fontWeight = FontWeight.SemiBold)
                        Text(text = "Heat the oil in a frying pan, then tip in the egg. Leave to set for 30 secs-1 min, swirling every now and again, then tip it out and finely slice. Add the bacon and mushrooms to pan, then fry until golden, about 3 mins. Add the peas, garlic and ginger, then cook for 1 min.")
                    }
                    Column() {
                        Text(text = "Step 2", fontWeight = FontWeight.SemiBold)
                        Text(text = "Mix the soy sauce and sugar together. Turn up the heat, add the cooked rice to the pan, heat through, then splash in the sweet soy sauce. Stir through the egg and serve straight away, with more soy sauce if you like.")
                    }
                }
            }
        })


    }

}
@Preview(showBackground = true, heightDp = 800, widthDp = 390)
@Composable
fun GreetingPreview6() {
    MyApplicationTheme {
        RiceHome()
    }
}