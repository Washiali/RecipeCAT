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

class MainActivityFries : ComponentActivity() {
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
fun FriesHome(){
    Column(
        modifier=Modifier.padding(top = 20.dp,)
    ) {
        FriesPageTitle()
        FriesCard()
    }
}
@Composable
fun FriesPageTitle(
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
fun FriesCard()
{
    Card(modifier = Modifier
        .size(160.dp)
        .background(color = Color.DarkGray)
        .fillMaxWidth()

    ){
        Image(painter = painterResource(id = R.drawable.fries), contentDescription = null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillHeight)
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
            Text(text ="French Fries", fontSize = 25.sp, fontWeight = FontWeight.Bold,)
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
                Text(text = "Lunch Dinner",modifier = Modifier.padding(top = 2.dp,start = 5.dp))

            }
            Row(){
                Text(text = "Serving:", fontWeight = FontWeight.SemiBold,modifier = Modifier.padding(top = 2.dp))
                Text(text = "5",modifier = Modifier.padding(top = 2.dp,start = 5.dp))
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
                    Text(text = "Potatoes - 1 kg")
                    Text(text = "Salt - 1/2 teaspoon")
                    Text(text = "Flour - 1 cup")
                    Text(text = "Oil - 2 quarts")
                    Text(text = "Paprika - 1 teaspoon")
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(top = 15.dp, start = 10.dp, end = 10.dp)
                ) {
                    Text(text = "Direction Steps", fontSize = 20.sp, fontWeight = FontWeight.SemiBold )
                    Column() {
                        Text(text = "Step 1", fontWeight = FontWeight.SemiBold)
                        Text(text = "Peel the potatoes and cut into 1cm-thick batons. Put into a bowl of cold water and leave to soak for at least 2 hrs to remove the starch from the potatoes – this will help them crisp while frying.")
                    }
                    Column() {
                        Text(text = "Step 2", fontWeight = FontWeight.SemiBold)
                        Text(text = "Drain the potatoes well and pat dry with kitchen paper. Fill a deep pan no more than a third full with oil and heat to 140C, or until a cube of bread dropped in browns in 60 seconds. Fry the French fries in batches for 6 mins per batch until golden straw-coloured, cooked through and lightly crisp. Drain well on kitchen paper.")
                    }
                    Column() {
                        Text(text = "Step 3", fontWeight = FontWeight.SemiBold)
                        Text(text = "Turn the heat up until the oil reaches 180C, or a cube of bread browns in 30 seconds. Fry the French fries again for 2-3 mins per batch until lightly golden and really crisp. Drain on kitchen paper and immediately season with sea salt.")
                    }

                }
            }
        })



    }

}


@Preview(showBackground = true, heightDp = 800, widthDp = 390)
@Composable
fun GreetingPreview9() {
    MyApplicationTheme {
        FriesHome()
    }
}