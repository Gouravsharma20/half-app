package wu.tutorials.half_app


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import wu.tutorials.half_app.ui.theme.DrawerPanel
import wu.tutorials.half_app.ui.theme.MenuGrid
import wu.tutorials.half_app.ui.theme.MiddleButton
import wu.tutorials.half_app.ui.theme.TopAppBar


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomeScreen()
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()
    Scaffold(scaffoldState=scaffoldState , drawerContent = { DrawerPanel(
        scaffoldState = scaffoldState,
        scope = scope
    )}, topBar = { TopAppBar(scaffoldState = scaffoldState, scope = scope) }) {
        Column(modifier = Modifier.padding(1.dp)) {
            UpperPanel()
            MenuCategory()

            MiddleButton(navController = navController)
            MenuGrid()

        }

    }

}

