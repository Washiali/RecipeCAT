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

class MainActivityPork : ComponentActivity() {
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
fun PorkHome(){
    Column(
        modifier=Modifier.padding(top = 20.dp,)
    ) {
        PorkPageTitle()
        PorkCard()
    }
}

@Composable
fun PorkPageTitle(
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
fun PorkCard()
{
    Card(modifier = Modifier
        .size(160.dp)
        .background(color = Color.DarkGray)
        .fillMaxWidth()

    ){
        Image(painter = painterResource(id = R.drawable.pork), contentDescription = null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillHeight)
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
            Text(text ="Roasted Pork", fontSize = 25.sp, fontWeight = FontWeight.Bold,)
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
                    Text(text = "2.7kg boned pork shoulder")
                    Text(text = "1 tsp chilli powder")
                    Text(text = "1 tsp mustard powder")
                    Text(text = "1 tsp ground cumin")
                    Text(text = "2 tsp smoked paprika")
                    Text(text = "2 tbsp cider vinegar")
                    Text(text = "1 tsp black treacle")
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(top = 15.dp, start = 10.dp, end = 10.dp)
                ) {
                    Text(text = "Direction Steps", fontSize = 20.sp, fontWeight = FontWeight.SemiBold )
                    Column() {
                        Text(text = "Step 1", fontWeight = FontWeight.SemiBold)
                        Text(text = "In a small bowl, mix the treacle, cider vinegar, paprika, cumin, mustard powder and chilli powder until smooth. Using a sharp knife, make deep slashes in the skin of the pork shoulder to cut through the skin and fat layer, but not the meat. Place the joint, skin-side down, in a large dish and rub the spice paste into the meat (not the fat). Turn skin-side, cover tightly with cling film and put in the fridge overnight, or for 24 hrs to give the pork maximum flavour.")
                    }
                    Column() {
                        Text(text = "Step 2", fontWeight = FontWeight.SemiBold)
                        Text(text = "Heat oven to 150C/130C fan/gas 2. Transfer the pork, skin-side up, to a deep roasting tin, rub 1 tbsp sea salt onto the skin and pour 500ml water into the bottom of the roasting tin. Cover tightly with foil and roast in the oven for 5 hrs.")
                    }
                    Column() {
                        Text(text = "Step 3", fontWeight = FontWeight.SemiBold)
                        Text(text = "Remove the foil, turn up the oven to 200C/180C fan/gas 6 and cook for a further 1 hr 30 mins or until the pork is very tender and the skin has turned to crispy crackling.")
                    }
                    Column() {
                        Text(text = "Step 4", fontWeight = FontWeight.SemiBold)
                        Text(text = "Once the pork is ready, take it out of the roasting tin, cover with foil and leave to rest. Pour the juices from the roasting tin into a jug and leave to separate. Pour off the fat layer and transfer the remaining juices to a large sauté pan. Simmer over a high heat, stirring, until reduced to a rich gravy.")
                    }
                    Column() {
                        Text(text = "Step 5", fontWeight = FontWeight.SemiBold)
                        Text(text = "Once rested, cut the pork into pieces – it should pull apart with very little effort – and break the crackling into shards. Serve the pork and crackling with the gravy poured over and mustard mash, honey-roasted carrots and quick pickled red cabbage on the side (see goes well with below).")
                    }
                }
            }
        })



    }

}

@Preview(showBackground = true, heightDp = 800, widthDp = 390)
@Composable
fun GreetingPreview7() {
    MyApplicationTheme {
        PorkHome()
    }
}