package wu.tutorials.half_app.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import wu.tutorials.half_app.MenuCategory
import wu.tutorials.half_app.UpperPanel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    Scaffold (
        topBar = {
            TopAppBar()
        }) {
        Column {
            UpperPanel()
            MenuCategory()
        }
    }

}