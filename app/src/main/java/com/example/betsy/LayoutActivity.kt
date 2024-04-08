package com.example.betsy

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.betsy.ui.theme.BetsyTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
               Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout () {
Column(modifier = Modifier.fillMaxSize()) {
      val mContext = LocalContext.current

    //TopAppBar
    TopAppBar(
        title = { Text(text = "HomeScreen", color = Color.White) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
    navigationIcon = {
        IconButton(onClick = {
            mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
            Icon(imageVector = Icons.Default.ArrowBack ,
                contentDescription = "arrow back" ,
                tint = Color.White)

        }

    }
        ,actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Share ,
                    contentDescription = "share" ,
                    tint = Color.White)

            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Settings ,
                    contentDescription = "settings" ,
                    tint = Color.White)

            }
        }
    )
    // End of topappbar

    Text(
        text = "Destinations",
        fontSize = 30.sp,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        fontFamily = FontFamily.Cursive
        )
    //First row
    Row {
       Image(painter = painterResource(id = R.drawable.france),
           contentDescription = "France",
           modifier = Modifier.size(width = 200.dp, height = 150.dp))
       Spacer(modifier =Modifier.width(15.dp) )

        Column {
            Text(text = "FRANCE",
                fontWeight = FontWeight.Bold)
            Text(text = "France, in Western Europe, encompasses medieval cities, alpine villages and Mediterranean beaches. Paris, its capital, is famed for its fashion houses, classical art . ")
        }
    }
    Spacer(modifier = Modifier.height(15.dp))
    //End of row

    //Second row
    Row {
        Image(painter = painterResource(id = R.drawable.bangkok),
            contentDescription = "Bangkok",
            modifier = Modifier.size(width = 200.dp, height = 150.dp))
        Spacer(modifier =Modifier.width(15.dp) )

        Column {
            Text(text = "BANGKOK",
                fontWeight = FontWeight.Bold)
            Text(text = "Bangkok, in Thailand, encompasses medieval cities, alpine villages and Mediterranean beaches. Paris, its capital, is famed for its fashion houses, classical art . ")
        }
    }
    Spacer(modifier = Modifier.height(15.dp))
    //End of row

    //Third row
    Row {
        Image(painter = painterResource(id = R.drawable.bali),
            contentDescription = "bali",
            modifier = Modifier.size(width = 200.dp, height = 150.dp))
        Spacer(modifier =Modifier.width(15.dp) )

        Column {
            Text(text = "BALI",
                fontWeight = FontWeight.Bold)
            Text(text = "Bali, in Indonesia, encompasses medieval cities, alpine villages and Mediterranean beaches. Paris, its capital, is famed for its fashion houses, classical art . ")
        }
    }
    Spacer(modifier = Modifier.height(35.dp))
    //End of row
    Button(onClick = {  mContext.startActivity(Intent(mContext,IntentActivity::class.java)) },
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(Color.Red),
        modifier = Modifier
            .fillMaxWidth()
            )
    {
        Text(text = "Next")

    }
}
}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
     Layout()

}