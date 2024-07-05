package wu.tutorials.half_app

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import wu.tutorials.half_app.ui.theme.Half_appTheme
import java.util.Locale.Category

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomeScreen()
            val context = LocalContext.current
            Column(modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF495E57))
                .padding(top = 25.dp, start = 15.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start

                ) {
                Text(text = stringResource(id = R.string.top_heading), fontSize = 32.sp, color = Color(0xFFF4CE14), modifier = Modifier.padding(top=10.dp))
                Text(text = stringResource(id = R.string.tag_line), fontSize = 24.sp, color = Color.White, modifier = Modifier.padding(top = 5.dp,bottom=10.dp))



                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp), horizontalArrangement = Arrangement.Start){

                    Text(text = stringResource(id = R.string.discription), color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold, modifier = Modifier
                        .width(200.dp)
                        .height(100.dp))
                    Image(painter = painterResource(id = R.drawable.littlelemon), contentDescription = "", modifier = Modifier
                        .width(220.dp)
                        .height(110.dp)
                        .clip(
                            RoundedCornerShape(200.dp)
                        ))
                }
                Button(onClick = {Toast.makeText(context, getText(R.string.button),Toast.LENGTH_LONG).show()},
                    colors = ButtonDefaults.buttonColors(Color.Gray),
                    border = BorderStroke(1.dp,Color.Red), modifier = Modifier.padding(top = 10.dp)) {
                    Text(text = "submit")
                }
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
                    , horizontalArrangement = Arrangement.SpaceEvenly
                )

                {
                    categories.forEach{
                        MenuCategory(category = it)
                    }
                }
            }


        }

    }
}

@Composable
fun MenuCategory(category: String) {
    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Gray)) {
        Text(text = category)

    }
}


val categories = listOf<String>(
    "breakfast",
    "lunch",
    "dinner"

)

@Composable
fun HomeScreen() {
    Scaffold {
    }
    
}