package wu.tutorials.half_app.ui.theme

interface Destinations {
    val route:String
}
object Home:Destinations{
    override val route = "Home"
}
object NextScreen:Destinations{
    override val route = "NextScreen"
}
