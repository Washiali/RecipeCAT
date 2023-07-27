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

class MainActivitybeef : ComponentActivity() {
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
fun beefhome(){
    Column(
        modifier=Modifier.padding(top = 20.dp,)
    ) {
        BeefPageTitle()
        BeefCard()
    }
}
@Composable
fun BeefPageTitle(
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
fun BeefCard()
{
    Card(modifier = Modifier
        .size(160.dp)
        .background(color = Color.DarkGray)
        .fillMaxWidth()

    ){
        Image(painter = painterResource(id = R.drawable.beef), contentDescription = null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillHeight)
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
            Text(text ="Beef Steak", fontSize = 25.sp, fontWeight = FontWeight.Bold,)
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
                    Text(text = "2 celery sticks, thickly sliced")
                    Text(text = "1 onion, chopped")
                    Text(text = "2 really big carrots, halved lengthways then very chunkily sliced")
                    Text(text = "5 bay leaves")
                    Text(text = "2 thyme sprigs, 1 whole and 1 leaves picked")
                    Text(text = "1 tbsp vegetable oil")
                    Text(text = "1 tbsp butter")
                    Text(text = "2 tbsp plain flour")
                    Text(text = "2 tbsp tomato purée")
                    Text(text = "2 tbsp Worcestershire sauce")
                    Text(text = "2 beef stock cubes, crumbled")
                    Text(text = " 850g stewing beef (featherblade or brisket works nicely), cut into nice large chunks")


                }
            }
            item {
                Column(
                    modifier = Modifier.padding(top = 15.dp, start = 10.dp, end = 10.dp)
                ) {
                    Text(text = "Direction Steps", fontSize = 20.sp, fontWeight = FontWeight.SemiBold )
                    Column() {
                        Text(text = "Step 1", fontWeight = FontWeight.SemiBold)
                        Text(text = "Heat oven to 160C/140C fan/gas 3 and put the kettle on.")
                    }
                    Column() {
                        Text(text = "Step 2", fontWeight = FontWeight.SemiBold)
                        Text(text = "Put 2 thickly sliced celery sticks, 1 chopped onion, 2 chunkily sliced carrots, 5 bay leaves and 1 whole thyme sprig in a flameproof casserole dish with 1 tbsp vegetable oil and 1 tbsp butter.")
                    }
                    Column() {
                        Text(text = "Step 3", fontWeight = FontWeight.SemiBold)
                        Text(text = "Soften for 10 mins, then stir in 2 tbsp plain flour until it doesn’t look dusty anymore, followed by 2 tbsp tomato purée, 2 tbsp Worcestershire sauce and 2 crumbled beef stock cubes.")
                    }
                    Column() {
                        Text(text = "Step 4", fontWeight = FontWeight.SemiBold)
                        Text(text = "Gradually stir in 600ml hot water, then tip in 850g stewing beef and bring to a gentle simmer.")
                    }
                    Column() {
                        Text(text = "Step 5", fontWeight = FontWeight.SemiBold)
                        Text(text = "Cover and put in the oven for 2hrs 30 mins, then uncover and cook for 30mins – 1hr more until the meat is really tender and the sauce is thickened.")
                    }
                    Column() {
                        Text(text = "Step 6", fontWeight = FontWeight.SemiBold)
                        Text(text = "Garnish with the picked leaves of the remaining thyme sprig.")
                    }
                }
            }
        })



    }

}

@Preview(showBackground = true, heightDp = 800, widthDp = 390)
@Composable
fun GreetingPreview5() {
    MyApplicationTheme {
        beefhome()
    }
}