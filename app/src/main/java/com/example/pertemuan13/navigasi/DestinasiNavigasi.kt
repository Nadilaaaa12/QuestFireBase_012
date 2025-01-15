package com.example.pertemuan13.navigasi

interface DestinasiNavigasi{
    val route: String
    val titleRes: String
}

object DestinasiHome: DestinasiNavigasi{
    override val route: String = "home"
    override val titleRes: String = "Home"
}

object DestinasiInsert: DestinasiNavigasi{
    override val route: String = "insert"
    override val titleRes: String = "Insert"
}

object DestinasiDetail : DestinasiNavigasi{
    override val route ="detail"
    override val titleRes: String ="detail"
    const val NIM = "nim"
    val routesWithArg = "$route/{$NIM}"
}