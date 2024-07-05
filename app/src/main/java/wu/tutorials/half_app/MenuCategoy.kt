package wu.tutorials.half_app

import androidx.annotation.StringRes
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.ui.res.stringResource


@Composable
fun MenuCategory(){
    val scrollState = rememberScrollState()
    Row (modifier = Modifier
        .fillMaxWidth()
        .horizontalScroll(scrollState)
        .padding(top = 300.dp), horizontalArrangement = Arrangement.spacedBy(10.dp)
    ){
        Categories.forEach { category ->
            Button(onClick ={ } , colors = ButtonDefaults.buttonColors(Color.Gray)) {
                Text(text = category)
                
            }
        }

    }
    
}
val Categories = listOf<String>(
    "aalu",
    "chakalu",
    "bukhalu",
    "udalu",
    "bulalu"

)