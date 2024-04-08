package com.example.betsy

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.betsy.ui.theme.BetsyTheme

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Explore()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Cities", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,FormActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.Menu ,
                        contentDescription = "Menu" ,
                        tint = Color.Black)

                }

            }
            ,actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications ,
                        contentDescription = "Notifications" ,
                        tint = Color.Black)

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share ,
                        contentDescription = "share" ,
                        tint = Color.Black)

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Search ,
                        contentDescription = "Search" ,
                        tint = Color.Black)

                }
            }
        )
        // End of topappbar
        Column {
            Text(
                text = "Tickets",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp)
            )


            Spacer(modifier = Modifier.height(10.dp))
           Column {
               //Start of row
               Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                   //Column 1
                   Column {
                       Column {
                           Card(
                               modifier = Modifier
                                   .height(100.dp)
                                   .width(160.dp)
                           )
                           {
                               Box(
                                   modifier = Modifier.fillMaxWidth(),
                                   contentAlignment = Alignment.Center
                               )
                               {
                                   Image(
                                       painter = painterResource(id = R.drawable.bangkok),
                                       contentDescription = "Bangkok",
                                       modifier = Modifier.fillMaxSize(),
                                       contentScale = ContentScale.FillBounds
                                   )
                                   Icon(
                                       imageVector = Icons.Default.FavoriteBorder,
                                       contentDescription = "favouriteborder",
                                       tint = Color.White,
                                       modifier = Modifier
                                           .align(Alignment.TopEnd)
                                           .padding(15.dp)
                                   )
                               }
                           }
                       }

                       Spacer(modifier = Modifier.height(10.dp))
                       Text(
                           text = "Colosseum",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.ExtraBold,
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Row {
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                       }
                       Spacer(modifier = Modifier.height(2.dp))
                       Text(
                           text = "443 reviews",
                           fontSize = 13.sp,
                           fontFamily = FontFamily.Serif
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Text(
                           text = "From Ksh.40,000",
                           fontSize = 13.sp,
                           fontFamily = FontFamily.Serif,
                           color = Color.Blue
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Row {
                           OutlinedButton(onClick =
                           {
                               val callIntent = Intent(Intent.ACTION_DIAL)
                               callIntent.data = "tel:0720245837".toUri()
                               mContext.startActivity(callIntent)
                           })
                           {
                               Text(text = "Call")
                           }
                           OutlinedButton(onClick =
                           {
                               val shareIntent = Intent(Intent.ACTION_SEND)
                               shareIntent.type = "text/plain"
                               shareIntent.putExtra(
                                   Intent.EXTRA_EMAIL,
                                   arrayOf("akinyiglory2@gmail.com")
                               )
                               shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                               shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                               mContext.startActivity(shareIntent)
                           })
                           {
                               Text(text = "Email")
                           }
                       }
                   }
                   //End of column 1
                   Spacer(modifier = Modifier.width(20.dp))
                   //Column 2
                   Column {
                       Column {
                           Card(
                               modifier = Modifier
                                   .height(100.dp)
                                   .width(160.dp)
                           )
                           {
                               Box(
                                   modifier = Modifier.fillMaxWidth(),
                                   contentAlignment = Alignment.Center
                               )
                               {
                                   Image(
                                       painter = painterResource(id = R.drawable.france),
                                       contentDescription = "france",
                                       modifier = Modifier.fillMaxSize(),
                                       contentScale = ContentScale.FillBounds
                                   )
                                   Icon(
                                       imageVector = Icons.Default.FavoriteBorder,
                                       contentDescription = "favouriteborder",
                                       tint = Color.White,
                                       modifier = Modifier
                                           .align(Alignment.TopEnd)
                                           .padding(15.dp)
                                   )
                               }
                           }
                       }

                       Spacer(modifier = Modifier.height(10.dp))
                       Text(
                           text = "France",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.ExtraBold,
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Row {
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                       }
                       Spacer(modifier = Modifier.height(2.dp))
                       Text(
                           text = "443 reviews",
                           fontSize = 13.sp,
                           fontFamily = FontFamily.Serif
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Text(
                           text = "From Ksh.40,000",
                           fontSize = 13.sp,
                           fontFamily = FontFamily.Serif,
                           color = Color.Blue
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Row {
                           OutlinedButton(onClick =
                           {
                               val callIntent = Intent(Intent.ACTION_DIAL)
                               callIntent.data = "tel:0720245837".toUri()
                               mContext.startActivity(callIntent)
                           })
                           {
                               Text(text = "Call")
                           }
                           OutlinedButton(onClick =
                           {
                               val shareIntent = Intent(Intent.ACTION_SEND)
                               shareIntent.type = "text/plain"
                               shareIntent.putExtra(
                                   Intent.EXTRA_EMAIL,
                                   arrayOf("akinyiglory2@gmail.com")
                               )
                               shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                               shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                               mContext.startActivity(shareIntent)
                           })
                           {
                               Text(text = "Email")
                           }
                       }
                   }
                   //End of column

               }
               //End of row
               //Start of row
               Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                   //Column 3
                   Column {
                       Column {
                           Card(
                               modifier = Modifier
                                   .height(100.dp)
                                   .width(160.dp)
                           )
                           {
                               Box(
                                   modifier = Modifier.fillMaxWidth(),
                                   contentAlignment = Alignment.Center
                               )
                               {
                                   Image(
                                       painter = painterResource(id = R.drawable.bali),
                                       contentDescription = "Bali",
                                       modifier = Modifier.fillMaxSize(),
                                       contentScale = ContentScale.FillBounds
                                   )
                                   Icon(
                                       imageVector = Icons.Default.FavoriteBorder,
                                       contentDescription = "favouriteborder",
                                       tint = Color.White,
                                       modifier = Modifier
                                           .align(Alignment.TopEnd)
                                           .padding(15.dp)
                                   )
                               }
                           }
                       }

                       Spacer(modifier = Modifier.height(10.dp))
                       Text(
                           text = "Bali",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.ExtraBold,
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Row {
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                       }
                       Spacer(modifier = Modifier.height(2.dp))
                       Text(
                           text = "443 reviews",
                           fontSize = 13.sp,
                           fontFamily = FontFamily.Serif
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Text(
                           text = "From Ksh.40,000",
                           fontSize = 13.sp,
                           fontFamily = FontFamily.Serif,
                           color = Color.Blue
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Row {
                           OutlinedButton(onClick =
                           {
                               val callIntent = Intent(Intent.ACTION_DIAL)
                               callIntent.data = "tel:0720245837".toUri()
                               mContext.startActivity(callIntent)
                           })
                           {
                               Text(text = "Call")
                           }
                           OutlinedButton(onClick =
                           {
                               val shareIntent = Intent(Intent.ACTION_SEND)
                               shareIntent.type = "text/plain"
                               shareIntent.putExtra(
                                   Intent.EXTRA_EMAIL,
                                   arrayOf("akinyiglory2@gmail.com")
                               )
                               shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                               shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                               mContext.startActivity(shareIntent)
                           })
                           {
                               Text(text = "Email")
                           }
                       }
                   }
                   //End of column 3
                   Spacer(modifier = Modifier.width(20.dp))
                   //Column 4
                   Column {
                       Column {
                           Card(
                               modifier = Modifier
                                   .height(100.dp)
                                   .width(160.dp)
                           )
                           {
                               Box(
                                   modifier = Modifier.fillMaxWidth(),
                                   contentAlignment = Alignment.Center
                               )
                               {
                                   Image(
                                       painter = painterResource(id = R.drawable.lake),
                                       contentDescription = "China",
                                       modifier = Modifier.fillMaxSize(),
                                       contentScale = ContentScale.FillBounds
                                   )
                                   Icon(
                                       imageVector = Icons.Default.FavoriteBorder,
                                       contentDescription = "favouriteborder",
                                       tint = Color.White,
                                       modifier = Modifier
                                           .align(Alignment.TopEnd)
                                           .padding(15.dp)
                                   )
                               }
                           }
                       }

                       Spacer(modifier = Modifier.height(10.dp))
                       Text(
                           text = "China",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.ExtraBold,
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Row {
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                       }
                       Spacer(modifier = Modifier.height(2.dp))
                       Text(
                           text = "443 reviews",
                           fontSize = 13.sp,
                           fontFamily = FontFamily.Serif
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Text(
                           text = "From Ksh.40,000",
                           fontSize = 13.sp,
                           fontFamily = FontFamily.Serif,
                           color = Color.Blue
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Row {
                           OutlinedButton(onClick =
                           {
                               val callIntent = Intent(Intent.ACTION_DIAL)
                               callIntent.data = "tel:0720245837".toUri()
                               mContext.startActivity(callIntent)
                           })
                           {
                               Text(text = "Call")
                           }
                           OutlinedButton(onClick =
                           {
                               val shareIntent = Intent(Intent.ACTION_SEND)
                               shareIntent.type = "text/plain"
                               shareIntent.putExtra(
                                   Intent.EXTRA_EMAIL,
                                   arrayOf("akinyiglory2@gmail.com")
                               )
                               shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                               shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                               mContext.startActivity(shareIntent)
                           })
                           {
                               Text(text = "Email")
                           }
                       }
                   }
                   //End of column

               }
               //End of row
               //Start of row
               Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                   //Column 5
                   Column {
                       Column {
                           Card(
                               modifier = Modifier
                                   .height(100.dp)
                                   .width(160.dp)
                           )
                           {
                               Box(
                                   modifier = Modifier.fillMaxWidth(),
                                   contentAlignment = Alignment.Center
                               )
                               {
                                   Image(
                                       painter = painterResource(id = R.drawable.lake1),
                                       contentDescription = "Peru",
                                       modifier = Modifier.fillMaxSize(),
                                       contentScale = ContentScale.FillBounds
                                   )
                                   Icon(
                                       imageVector = Icons.Default.FavoriteBorder,
                                       contentDescription = "favouriteborder",
                                       tint = Color.White,
                                       modifier = Modifier
                                           .align(Alignment.TopEnd)
                                           .padding(15.dp)
                                   )
                               }
                           }
                       }

                       Spacer(modifier = Modifier.height(10.dp))
                       Text(
                           text = "Peru",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.ExtraBold,
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Row {
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                       }
                       Spacer(modifier = Modifier.height(2.dp))
                       Text(
                           text = "443 reviews",
                           fontSize = 13.sp,
                           fontFamily = FontFamily.Serif
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Text(
                           text = "From Ksh.40,000",
                           fontSize = 13.sp,
                           fontFamily = FontFamily.Serif,
                           color = Color.Blue
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Row {
                           OutlinedButton(onClick =
                           {
                               val callIntent = Intent(Intent.ACTION_DIAL)
                               callIntent.data = "tel:0720245837".toUri()
                               mContext.startActivity(callIntent)
                           })
                           {
                               Text(text = "Call")
                           }
                           OutlinedButton(onClick =
                           {
                               val shareIntent = Intent(Intent.ACTION_SEND)
                               shareIntent.type = "text/plain"
                               shareIntent.putExtra(
                                   Intent.EXTRA_EMAIL,
                                   arrayOf("akinyiglory2@gmail.com")
                               )
                               shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                               shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                               mContext.startActivity(shareIntent)
                           })
                           {
                               Text(text = "Email")
                           }
                       }
                   }
                   //End of column 5
                   Spacer(modifier = Modifier.width(20.dp))
                   //Column 6
                   Column {
                       Column {
                           Card(
                               modifier = Modifier
                                   .height(100.dp)
                                   .width(160.dp)
                           )
                           {
                               Box(
                                   modifier = Modifier.fillMaxWidth(),
                                   contentAlignment = Alignment.Center
                               )
                               {
                                   Image(
                                       painter = painterResource(id = R.drawable.wildlife),
                                       contentDescription = "Nairobi",
                                       modifier = Modifier.fillMaxSize(),
                                       contentScale = ContentScale.FillBounds
                                   )
                                   Icon(
                                       imageVector = Icons.Default.FavoriteBorder,
                                       contentDescription = "favouriteborder",
                                       tint = Color.White,
                                       modifier = Modifier
                                           .align(Alignment.TopEnd)
                                           .padding(15.dp)
                                   )
                               }
                           }
                       }

                       Spacer(modifier = Modifier.height(10.dp))
                       Text(
                           text = "Nairobi",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.ExtraBold,
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Row {
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                           Icon(
                               imageVector = Icons.Default.Star,
                               contentDescription = "star",
                               tint = Color.Blue
                           )
                       }
                       Spacer(modifier = Modifier.height(2.dp))
                       Text(
                           text = "443 reviews",
                           fontSize = 13.sp,
                           fontFamily = FontFamily.Serif
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Text(
                           text = "From Ksh.40,000",
                           fontSize = 13.sp,
                           fontFamily = FontFamily.Serif,
                           color = Color.Blue
                       )
                       Spacer(modifier = Modifier.height(2.dp))
                       Row {
                           OutlinedButton(onClick =
                           {
                               val callIntent = Intent(Intent.ACTION_DIAL)
                               callIntent.data = "tel:0720245837".toUri()
                               mContext.startActivity(callIntent)
                           })
                           {
                               Text(text = "Call")
                           }
                           OutlinedButton(onClick =
                           {
                               val shareIntent = Intent(Intent.ACTION_SEND)
                               shareIntent.type = "text/plain"
                               shareIntent.putExtra(
                                   Intent.EXTRA_EMAIL,
                                   arrayOf("akinyiglory2@gmail.com")
                               )
                               shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                               shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                               mContext.startActivity(shareIntent)
                           })
                           {
                               Text(text = "Email")
                           }
                       }
                   }
                   //End of column 6

               }
               //End of row
           }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun ExplorePreview(){
    Explore()
}