package wu.tutorials.half_app.ui.theme

import androidx.annotation.RestrictTo
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import wu.tutorials.half_app.R

@Composable
fun TopAppBar() {
    Row (modifier = Modifier.fillMaxWidth().padding(top = 35.dp), horizontalArrangement = Arrangement.SpaceAround){
        IconButton(onClick = {
        }) {
            Image(
                painter = painterResource(
                    id = R.drawable.hamburger
                ),
                contentDescription ="menu"
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(
                    id = R.drawable.littlelemonlogo
                ),
                contentDescription ="logo"
            )
        }
        Text(text = "Little-Lemon", fontWeight = FontWeight.Bold, fontSize = 28.sp, modifier = Modifier.padding(top = 8.dp))
        IconButton(onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(
                    id = R.drawable.cart
                ),
                contentDescription ="cart"
            )
        }

    }

}