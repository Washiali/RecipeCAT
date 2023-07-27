package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExitToApp
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

class MainActivity3 : ComponentActivity() {
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
fun Recipe(){
    Column(
        modifier=Modifier.padding(top = 20.dp,)
    ) {
        RecipePageTitle()
        RecipeCard()
    }
}

@Composable
fun RecipePageTitle(
){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
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
fun RecipeCard()
{
    Card(modifier = Modifier
        .size(160.dp)
        .background(color = Color.DarkGray)
        .fillMaxWidth()

    ){
        Image(painter = painterResource(id = R.drawable.chicken), contentDescription = null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillHeight)
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
            Text(text ="Fried Chicken", fontSize = 25.sp, fontWeight = FontWeight.Bold,)
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
                    Text(text = "Chicken - 5 pieces")
                    Text(text = "Buttermilk- 1 Cup")
                    Text(text = "Flour - 1 cup")
                    Text(text = "Oil - 2 quarts")
                    Text(text = "Paprika - 1 teaspoon")
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
                        Text(text = "Take your cut up chicken pieces and skin them if you prefer.")
                    }
                    Column() {
                        Text(text = "Step 2", fontWeight = FontWeight.SemiBold)
                        Text(text = "Put the flour in a large plastic bag (let the amount of chicken you are cooking dictate the amount of flour you use). Season the flour with paprika, salt and pepper to taste (paprika helps to brown the chicken).")
                    }
                    Column() {
                        Text(text = "Step 3", fontWeight = FontWeight.SemiBold)
                        Text(text = "Dip chicken pieces in buttermilk then, a few at a time, put them in the bag with the flour, seal the bag and shake to coat well.")
                    }
                    Column() {
                        Text(text = "Step 4", fontWeight = FontWeight.SemiBold)
                        Text(text = "Fill a large skillet (cast iron is best) about 1/3 to 1/2 full with vegetable oil. Heat until VERY hot.")
                    }
                    Column() {
                        Text(text = "Step 5", fontWeight = FontWeight.SemiBold)
                        Text(text = "Place the coated chicken on a cookie sheet or tray, and cover with a clean dish towel or waxed paper. LET SIT UNTIL THE FLOUR IS OF A PASTE-LIKE CONSISTENCY. THIS IS CRUCIAL!")
                    }
                    Column() {
                        Text(text = "Step 6", fontWeight = FontWeight.SemiBold)
                        Text(text = "Put in as many chicken pieces as the skillet can hold. Brown the chicken in HOT oil on both sides.")
                    }
                    Column() {
                        Text(text = "Step 7", fontWeight = FontWeight.SemiBold)
                        Text(text = "When browned, reduce heat and cover skillet; let cook for 30 minutes (the chicken will be cooked through but not crispy). Remove cover, raise heat again, and continue to fry until crispy.")
                    }
                    Column() {
                        Text(text = "Step 8", fontWeight = FontWeight.SemiBold)
                        Text(text = "Drain the fried chicken on paper towels. Depending on how much chicken you have, you may have to fry in a few shifts. Keep the finished chicken in a slightly warm oven while preparing the rest.")
                    }
                    
                }
            }
        })



    }

}

@Preview(showBackground = true, heightDp = 800, widthDp = 390 )
@Composable
fun GreetingPreview3() {
    MyApplicationTheme {
        Recipe()
    }
}