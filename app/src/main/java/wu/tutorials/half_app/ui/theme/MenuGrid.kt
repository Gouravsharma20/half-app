package wu.tutorials.half_app.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import wu.tutorials.half_app.R


@Composable
fun MenuGrid() {
    Column(Modifier.verticalScroll(rememberScrollState())) {
        repeat(20){
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                repeat(2) {
                    GridCell()
                }

            }

        }

    }
    GridCell()

}

@Composable
fun GridCell() {
    Card (elevation = CardDefaults.cardElevation(defaultElevation = 16.dp), modifier = Modifier.padding(8.dp)
    ) {
        Box (modifier = Modifier
            .requiredSize(180.dp, 100.dp)
            .padding(8.dp)){
            Image(painter = painterResource(id = R.drawable.gss), contentDescription = "greak salad", modifier = Modifier.fillMaxSize())
            Text(text = "Greak-Salad", fontSize = 18.sp, fontWeight = FontWeight.Bold, modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
                .background(Color.White)
                .align(Alignment.TopStart)
            )
            Text(text = "$9.99", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier
                .background(Color.White)
                .padding(4.dp)
                .align(Alignment.BottomEnd)
            )

        }


    }

}