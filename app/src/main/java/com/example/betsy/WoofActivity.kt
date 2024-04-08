package com.example.betsy

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.betsy.ui.theme.BetsyTheme

class WoofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Form()
        }
    }
}

@Composable
fun Form (){
    Column(modifier = Modifier.fillMaxSize())
    {
        val mContext = LocalContext.current
        var Koda by remember { mutableStateOf("") }
        var Lola by remember { mutableStateOf("") }
        var Frankie by remember { mutableStateOf("") }
        var Nox by remember { mutableStateOf("") }
        var Faye by remember { mutableStateOf("") }
        var Bella by remember { mutableStateOf("") }
        var Moana by remember { mutableStateOf("") }
        var Tzeitel by remember { mutableStateOf("") }

       Row {
           Box(modifier = Modifier.padding(start = 50.dp))


            {
               Image(painter = painterResource(id = R.drawable.bluep), contentDescription = "paw")

           }

               Text(
                   text = "Woof",
                   fontFamily = FontFamily.Serif,
                   fontSize = 40.sp,
                   modifier = Modifier
                       .padding(start = 30.dp, end = 50.dp),
                   textAlign = TextAlign.Center,
                   fontWeight = FontWeight.Bold)

       }

        Spacer(modifier = Modifier.height(10.dp))
        //First textfield
        TextField(value = Koda,
            onValueChange = {Koda = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Image(painter = painterResource(id = R.drawable.black),
                contentDescription = "cars",
                modifier = Modifier
                    .size(35.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop) },
            placeholder = {
                Column {
                    Text(text = "Koda",
                        fontWeight = FontWeight.Bold)

                    Text(text = "2 years old")
                }
            }

        )
        Spacer(modifier = Modifier.height(15.dp))
        //End of textfield
        //Second textfield
        TextField(value = Lola,
            onValueChange = {Lola = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Image(painter = painterResource(id = R.drawable.black),
                contentDescription = "cars",
                modifier = Modifier
                    .size(35.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop) },
            placeholder = {
                Column {
                    Text(text = "Lola",
                        fontWeight = FontWeight.Bold)

                    Text(text = "16 years old")
                }
            }

        )
        Spacer(modifier = Modifier.height(15.dp))
        //End of textfield
        //Third textfield
        TextField(value = Frankie,
            onValueChange = {Frankie = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Image(painter = painterResource(id = R.drawable.black),
                contentDescription = "cars",
                modifier = Modifier
                    .size(35.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop) },
            placeholder = {
                Column {
                    Text(text = "Frankie",
                        fontWeight = FontWeight.Bold)

                    Text(text = "2 years old")
                }
            }

        )
        Spacer(modifier = Modifier.height(15.dp))
        //End of textfield
        //Fourth textfield
        TextField(value = Nox,
            onValueChange = {Nox = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Image(painter = painterResource(id = R.drawable.black),
                contentDescription = "cars",
                modifier = Modifier
                    .size(35.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop) },
            placeholder = {
                Column {
                    Text(text = "Nox",
                        fontWeight = FontWeight.Bold)

                    Text(text = "8 years old")
                }
            }

        )
        Spacer(modifier = Modifier.height(15.dp))
        //End of textfield
        //Fifth textfield
        TextField(value = Faye,
            onValueChange = {Faye = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Image(painter = painterResource(id = R.drawable.black),
                contentDescription = "cars",
                modifier = Modifier
                    .size(35.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop) },
            placeholder = {
                Column {
                    Text(text = "Faye",
                        fontWeight = FontWeight.Bold)

                    Text(text = "8 years old")
                }
            }

        )
        Spacer(modifier = Modifier.height(15.dp))
        //End of textfield
        //Sixth textfield
        TextField(value = Bella,
            onValueChange = {Bella = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Image(painter = painterResource(id = R.drawable.black),
                contentDescription = "cars",
                modifier = Modifier
                    .size(35.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop) },
            placeholder = {
                Column {
                    Text(text = "Bella",
                        fontWeight = FontWeight.Bold)

                    Text(text = "14 years old")
                }
            }

        )
        Spacer(modifier = Modifier.height(15.dp))
        //End of textfield
        //Seventh textfield
        TextField(value = Moana,
            onValueChange = {Moana = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Image(painter = painterResource(id = R.drawable.black),
                contentDescription = "cars",
                modifier = Modifier
                    .size(35.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop) },
            placeholder = {
                Column {
                    Text(text = "Moana",
                        fontWeight = FontWeight.Bold)

                    Text(text = "2 years old")
                }
            }

        )
        Spacer(modifier = Modifier.height(15.dp))
        //End of textfield
        //Eighth textfield
        TextField(value = Tzeitel,
            onValueChange = {Tzeitel = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Image(painter = painterResource(id = R.drawable.black),
                contentDescription = "cars",
                modifier = Modifier
                    .size(35.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop) },
            placeholder = {
                Column {
                    Text(text = "Tzeitel",
                        fontWeight = FontWeight.Bold)

                    Text(text = "7 years old")
                }
            }

        )
        Spacer(modifier = Modifier.height(15.dp))
        //End of textfield

    }





}
@Preview(showBackground = true)
@Composable
fun FormPreview(){

    Form()
}