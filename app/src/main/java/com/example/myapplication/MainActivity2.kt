package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity2 : ComponentActivity() {
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
fun RecipeListPage(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(top = 20.dp, start = 12.dp, end = 12.dp, bottom = 20.dp)
    ) {
        ListIcon()
        ListSection()

    }


}

@Composable
fun ListIcon(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(height = 60.dp),

    ) {
        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = null, modifier = Modifier.padding(top = 5.dp))
            Text(text = "Recipes List", modifier = Modifier.padding(start = 10.dp), fontSize = 30.sp)
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Icon(imageVector = Icons.Default.Search, contentDescription = null, modifier = Modifier.padding(end = 10.dp, top = 5.dp) )
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = null, modifier = Modifier.padding(top = 5.dp) )
        }

    }


}

@Composable
fun ListSection(){
    LazyColumn(content = {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, bottom = 15.dp),
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(painter = painterResource(id = R.drawable.chicken), contentDescription = null, Modifier.width(width = 100.dp).height(height = 100.dp))
                    Text(text = "Fried Chicken",
                    fontSize = 25.sp,
                    modifier = Modifier.padding(start = 25.dp,top = 33.dp))
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = null,modifier = Modifier.padding(top = 35.dp) )
                }
            }
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, bottom = 15.dp),
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(painter = painterResource(id = R.drawable.rice), contentDescription = null, Modifier.width(width = 100.dp).height(height = 100.dp))
                    Text(text = "Fried Rice",
                        fontSize = 25.sp,
                        modifier = Modifier.padding(start = 25.dp,top = 33.dp))
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = null,modifier = Modifier.padding(top = 35.dp))
                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, bottom = 15.dp),
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(painter = painterResource(id = R.drawable.pork), contentDescription = null, Modifier.width(width = 100.dp).height(height = 100.dp))
                    Text(text = "Roasted Pork",
                        fontSize = 25.sp,
                        modifier = Modifier.padding(start = 25.dp,top = 33.dp))
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = null,modifier = Modifier.padding(top = 35.dp) )
                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, bottom = 15.dp),
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(painter = painterResource(id = R.drawable.naan), contentDescription = null, Modifier.width(width = 100.dp).height(height = 100.dp))
                    Text(text = " Chapati",
                        fontSize = 25.sp,
                        modifier = Modifier.padding(start = 25.dp,top = 33.dp))
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = null,modifier = Modifier.padding(top = 35.dp) )
                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, bottom = 15.dp),
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(painter = painterResource(id = R.drawable.fries
                    ), contentDescription = null, Modifier.width(width = 100.dp).height(height = 100.dp))
                    Text(text = "French Fries",
                        fontSize = 25.sp,
                        modifier = Modifier.padding(start = 25.dp, top = 33.dp))
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = null,modifier = Modifier.padding(top = 35.dp) )
                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, bottom = 15.dp),
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(painter = painterResource(id = R.drawable.naan), contentDescription = null, Modifier.width(width = 100.dp).height(height = 100.dp))
                    Text(text = "Naan Bread",
                        fontSize = 25.sp,
                        modifier = Modifier.padding(start = 25.dp,top = 33.dp))
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = null,modifier = Modifier.padding(top = 35.dp) )
                }
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, bottom = 15.dp),
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(painter = painterResource(id = R.drawable.beef), contentDescription = null, Modifier.width(width = 100.dp).height(height = 100.dp))
                    Text(text = "Beef Steak",
                        fontSize = 25.sp,
                        modifier = Modifier.padding(start = 25.dp,top = 33.dp))
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = null, modifier = Modifier.padding(top = 35.dp) )
                }
            }
        }


    })



}


@Preview(showBackground = true, heightDp = 800, widthDp = 390)
@Composable
fun GreetingPreview2() {
    MyApplicationTheme {
        RecipeListPage()
    }
}