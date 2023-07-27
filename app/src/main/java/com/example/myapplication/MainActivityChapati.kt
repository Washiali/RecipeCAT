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
import androidx.compose.material3.Card
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

class MainActivityChapati : ComponentActivity() {
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
fun ChapatiHome(){
    Column(
        modifier=Modifier.padding(top = 20.dp,)
    ) {
        ChapatiPageTitle()
        ChapatiCard()
    }
}
@Composable
fun ChapatiPageTitle(
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
fun ChapatiCard()
{
    Card(modifier = Modifier
        .size(160.dp)
        .background(color = Color.DarkGray)
        .fillMaxWidth()

    ){
        Image(painter = painterResource(id = R.drawable.chapati), contentDescription = null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillHeight)
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(top = 20.dp),
    ) {
        Column(
            modifier = Modifier.padding(top = 10.dp,start = 10.dp)
        ) {
            Text(text ="Chapati", fontSize = 25.sp, fontWeight = FontWeight.Bold,)
            Row(
                modifier = Modifier.padding(top = 2.dp)
            ) {
                Icon(imageVector = Icons.Default.Star, contentDescription = null,  )
                Icon(imageVector = Icons.Default.Star, contentDescription = null )
                Icon(imageVector = Icons.Default.Star, contentDescription = null )
                Icon(imageVector = Icons.Default.Star, contentDescription = null )

                Text(text = "4",modifier = Modifier.padding(top = 2.dp, start = 5.dp))

            }
            Row() {
                Text(text = "Meal Type:", fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(top = 2.dp))
                Text(text = "Lunch Dinner",modifier = Modifier.padding(top = 2.dp,start = 5.dp))

            }
            Row(){
                Text(text = "Serving:", fontWeight = FontWeight.SemiBold,modifier = Modifier.padding(top = 2.dp))
                Text(text = "6",modifier = Modifier.padding(top = 2.dp,start = 5.dp))
            }
            Row() {
                Text(text = "Difficulty Level:",fontWeight = FontWeight.SemiBold,modifier = Modifier.padding(top = 2.dp))
                Text(text = "Intermediary",modifier = Modifier.padding(top = 2.dp, start = 5.dp))

            }
        }
        LazyColumn(content = {
            item {
                Column(
                    modifier = Modifier.padding(top = 15.dp, start = 10.dp)
                ) {
                    Text(text = "Ingredients", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
                    Text(text = "WholeMeal Flour - 1 cup")
                    Text(text = "Oil - 1 quarts")
                    Text(text = "Hot Water- 180ml")
                    Text(text = "Salt - 1/2 teaspoon")
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(top = 15.dp, start = 10.dp, end = 10.dp)
                ) {
                    Text(text = "Direction Steps", fontSize = 20.sp, fontWeight = FontWeight.SemiBold )
                    Column() {
                        Text(text = "Step 1", fontWeight = FontWeight.SemiBold)
                        Text(text = "In a large bowl, stir together the flours and salt. Use a wooden spoon to stir in the olive oil and enough water to make a soft dough that is elastic but not sticky.")
                    }
                    Column() {
                        Text(text = "Step 2", fontWeight = FontWeight.SemiBold)
                        Text(text = "Knead the dough on a lightly floured surface for 5-10 mins until it is smooth. Divide into 10 pieces, or less if you want bigger breads. Roll each piece into a ball. Let rest for a few mins.")
                    }
                    Column() {
                        Text(text = "Step 3", fontWeight = FontWeight.SemiBold)
                        Text(text = "Heat a frying pan over medium heat until hot, and grease lightly. On a lightly floured surface, use a floured rolling pin to roll out the balls of dough until very thin like a tortilla.")
                    }
                    Column() {
                        Text(text = "Step 4", fontWeight = FontWeight.SemiBold)
                        Text(text = "When the pan starts smoking, put a chapati on it. Cook until the underside has brown spots, about 30 seconds, then flip and cook on the other side. Put on a plate and keep warm while you cook the rest of the chapatis.")
                    }
                }
            }
        })



    }

}


@Preview(showBackground = true, heightDp = 800, widthDp = 390)
@Composable
fun GreetingPreview8() {
    MyApplicationTheme {
        ChapatiHome()
    }
}