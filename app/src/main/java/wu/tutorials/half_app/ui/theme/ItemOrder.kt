package wu.tutorials.half_app.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemOrder () {
    var Counter by rememberSaveable {
        mutableStateOf(0)
    }
    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "GREAK-SALAD",
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold
        )
    }
    Row(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 300.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Bottom
    ) {
        IconButton(onClick = { Counter -- }) {
            Icon(imageVector = Icons.Default.Clear
                , contentDescription = "minus"
            )
        }
        Text(text = "$Counter",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(12.dp)
        )
        IconButton(onClick = { Counter ++ }) {
            Icon(imageVector = Icons.Default.Add
                , contentDescription = "adding button"
            )
        }

    }
    
}