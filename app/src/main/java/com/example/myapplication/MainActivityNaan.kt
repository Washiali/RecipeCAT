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

class MainActivityNaan : ComponentActivity() {
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
fun NaanHome(){
    Column(
        modifier=Modifier.padding(top = 20.dp,)
    ) {
        NaanPageTitle()
        NaanCard()
    }
}
@Composable
fun NaanPageTitle(
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
fun NaanCard()
{
    Card(modifier = Modifier
        .size(160.dp)
        .background(color = Color.DarkGray)
        .fillMaxWidth()

    ){
        Image(painter = painterResource(id = R.drawable.naan), contentDescription = null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillHeight)
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
            Text(text ="Naan Bread", fontSize = 25.sp, fontWeight = FontWeight.Bold,)
            Row(
                modifier = Modifier.padding(top = 2.dp)
            ) {
                Icon(imageVector = Icons.Default.Star, contentDescription = null,  )
                Icon(imageVector = Icons.Default.Star, contentDescription = null )
                Icon(imageVector = Icons.Default.Star, contentDescription = null )
                Icon(imageVector = Icons.Default.Star, contentDescription = null )

                Text(text = "4.5",modifier = Modifier.padding(top = 2.dp, start = 5.dp))

            }
            Row() {
                Text(text = "Meal Type:", fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(top = 2.dp))
                Text(text = "breakfast / Lunch / Dinner",modifier = Modifier.padding(top = 2.dp,start = 5.dp))

            }
            Row(){
                Text(text = "Serving:", fontWeight = FontWeight.SemiBold,modifier = Modifier.padding(top = 2.dp))
                Text(text = "5",modifier = Modifier.padding(top = 2.dp,start = 5.dp))
            }
            Row() {
                Text(text = "Difficulty Level:",fontWeight = FontWeight.SemiBold,modifier = Modifier.padding(top = 2.dp))
                Text(text = "Beginner",modifier = Modifier.padding(top = 2.dp, start = 5.dp))

            }
        }
        LazyColumn(content = {
            item {
                Column(
                    modifier = Modifier.padding(top = 15.dp, start = 10.dp)
                ) {
                    Text(text = "Ingredients", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
                    Text(text = "Warm Water -  1 Cup")
                    Text(text = "Plain Yoghurt- 1/2 cup")
                    Text(text = "Salt - 1/2 teaspoon")
                    Text(text = "Melted Butter - 2 quarts")
                    Text(text = "All Purpose Flour - 2 1/2 cups")
                    Text(text = "Oil - 1 tablespoon")
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(top = 15.dp, start = 10.dp, end = 10.dp)
                ) {
                    Text(text = "Direction Steps", fontSize = 20.sp, fontWeight = FontWeight.SemiBold )
                    Column() {
                        Text(text = "Step 1", fontWeight = FontWeight.SemiBold)
                        Text(text = "In a small bowl, add the sugar, warm water, and yeast together. Stir to combine well. The yeast should be activated when it becomes foamy, about 10 minutes. Transfer the flour to a flat surface and make a well in the middle.")
                    }
                    Column() {
                        Text(text = "Step 2", fontWeight = FontWeight.SemiBold)
                        Text(text = "Add the yeast mixture, yogurt, salt and oil, knead the dough until the surface becomes smooth and shiny, about 10 minutes. Cover the dough with a damp cloth and let it rise in a warm place (for example: beside the stove top or warm oven). The dough should double in size, about 1 hour.")
                    }
                    Column() {
                        Text(text = "Step 3", fontWeight = FontWeight.SemiBold)
                        Text(text = "Divide the dough into 8 equal portions. Roll the dough to a 8” circle using a rolling spin.")
                    }
                    Column() {
                        Text(text = "Step 4", fontWeight = FontWeight.SemiBold)
                        Text(text = "Heat up a skillet (cast-iron preferred) over high heat and lightly grease the surface with some oil to avoid the dough from sticking to the skillet. Place the dough on the skillet. When it puffs up and bubbles and burnt spots appear, flip it over and cook the other side. Repeat the same until all dough are done.")
                    }
                    Column() {
                        Text(text = "Step 5", fontWeight = FontWeight.SemiBold)
                        Text(text = "Brush the naan with the melted butter, serve warm.")
                    }
                }
            }
        })



    }

}


@Preview(showBackground = true, heightDp = 800, widthDp = 390)
@Composable
fun GreetingPreview10() {
    MyApplicationTheme {
        NaanHome()
    }
}