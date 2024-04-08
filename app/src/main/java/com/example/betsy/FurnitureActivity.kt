package com.example.betsy

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.betsy.ui.theme.BetsyTheme

class FurnitureActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFurniture()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyFurniture()
{
Column(modifier = Modifier.fillMaxSize(),

   )
    {
        val mContext = LocalContext.current
//TopAppBar
        TopAppBar(
            title = { Text(text = "", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack ,
                        contentDescription = "arrow back" ,
                        tint = Color.Black)

                }

            }
            ,actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ShoppingCart ,
                        contentDescription = "shoppingcart" ,
                        tint = Color.Black)

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu ,
                        contentDescription = "menu" ,
                        tint = Color.Black)

                }
            }
        )
        // End of topappbar
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Text(
                text = "Chairs",
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp)
            )

            Text(
                text = "Tables",
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp),
                color = Color.LightGray
            )

            Text(
                text = "Sofa",
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp),
                color = Color.LightGray
            )

            Text(
                text = "Bed",
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp),
                color = Color.LightGray
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Text(
                text = "120 Products",
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(start = 20.dp)

            )
            Text(
                text = "Popular",
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 200.dp)

            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        //First Row
       Row (modifier = Modifier.padding(start = 20.dp, end = 20.dp))
       {
          Card (modifier = Modifier
              .height(200.dp)
              .width(150.dp)){
              //Column 1
              Column (modifier = Modifier.padding(15.dp))
              {

                  Image(
                      painter = painterResource(id = R.drawable.bangkok),
                      contentDescription = "Bangkok",
                      modifier = Modifier.padding(start = 10.dp)

                  )
                  Spacer(modifier = Modifier.height(10.dp))
                  Text(
                      text = "Amos Chair",
                      fontSize = 15.sp,
                      fontFamily = FontFamily.SansSerif,
                      fontWeight = FontWeight.Bold,
                      modifier = Modifier.padding(start = 10.dp)
                  )
                  Spacer(modifier = Modifier.height(10.dp))
                  Text(
                      text = "Amos chair for sale in residents around the area.",
                      fontSize = 10.sp,
                      fontFamily = FontFamily.SansSerif,
                      modifier = Modifier.padding(start = 10.dp,)

                  )
                  Spacer(modifier = Modifier.height(10.dp))
                  Text(
                      text = "Ksh.6800",
                      fontSize = 15.sp,
                      fontFamily = FontFamily.SansSerif,

                      modifier = Modifier.padding(start = 10.dp)
                  )

              }
              //End of Column
          }
           Spacer(modifier = Modifier.width(30.dp))
          Card (modifier = Modifier
              .height(200.dp)
              .width(150.dp)){
              //Column 1
              Column (modifier = Modifier.padding(15.dp))
              {

                  Image(
                      painter = painterResource(id = R.drawable.bangkok),
                      contentDescription = "Bangkok",
                      modifier = Modifier.padding(start = 10.dp)

                  )
                  Spacer(modifier = Modifier.height(10.dp))
                  Text(
                      text = "Amos Chair",
                      fontSize = 15.sp,
                      fontFamily = FontFamily.SansSerif,
                      fontWeight = FontWeight.Bold,
                      modifier = Modifier.padding(start = 10.dp)
                  )
                  Spacer(modifier = Modifier.height(10.dp))
                  Text(
                      text = "Amos chair for sale in residents around the area.",
                      fontSize = 10.sp,
                      fontFamily = FontFamily.SansSerif,
                      modifier = Modifier.padding(start = 10.dp)
                  )
                  Spacer(modifier = Modifier.height(10.dp))
                  Text(
                      text = "Ksh.6800",
                      fontSize = 15.sp,
                      fontFamily = FontFamily.SansSerif,

                      modifier = Modifier.padding(start = 10.dp)
                  )

              }
              //End of Column
          }
       }
        Spacer(modifier = Modifier.height(20.dp))
        //End of row
        //First Row
        Row (modifier = Modifier.padding(start = 20.dp, end = 20.dp))
        {
            Card (modifier = Modifier
                .height(200.dp)
                .width(150.dp)){
                //Column 1
                Column (modifier = Modifier.padding(15.dp))
                {

                    Image(
                        painter = painterResource(id = R.drawable.bangkok),
                        contentDescription = "Bangkok",
                        modifier = Modifier.padding(start = 10.dp)

                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Amos Chair",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Amos chair for sale in residents around the area.",
                        fontSize = 10.sp,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier.padding(start = 10.dp,)

                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Ksh.6800",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif,

                        modifier = Modifier.padding(start = 10.dp)
                    )

                }
                //End of Column
            }
            Spacer(modifier = Modifier.width(30.dp))
            Card (modifier = Modifier
                .height(200.dp)
                .width(150.dp)){
                //Column 1
                Column (modifier = Modifier.padding(15.dp))
                {

                    Image(
                        painter = painterResource(id = R.drawable.bangkok),
                        contentDescription = "Bangkok",
                        modifier = Modifier.padding(start = 10.dp)

                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Amos Chair",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Amos chair for sale in residents around the area.",
                        fontSize = 10.sp,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Ksh.6800",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif,

                        modifier = Modifier.padding(start = 10.dp)
                    )

                }
                //End of Column
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        //End of row



}
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyFurniturePreview(){
    MyFurniture()
}