package exemplo1

fun main() {
    trocaMusicaTyler()
    trocaMusicaAriana()
}
fun trocaMusicaTyler() {
    var artista = ""
    var album = ""
    var musica = ""
    var track = 2

    when (track) {
        0 -> artista = "Artista não encontrado"
        in 1..4 -> artista = "Tyler, The Creator"
        else -> artista = "Artista não encontrado"
    }

    musica = when (track) {
        1 -> "LUMBERJACK"
        2 -> "I THINK"
        3 -> "See You Again (ft. Kali Uchis)"
        4 -> "Domo23"
        else -> "Música não encontrada"
    }

    album = when (musica) {
        "LUMBERJACK" -> "CALL ME IF YOU GET LOST"
        "I THINK" -> "IGOR"
        "See You Again (ft. Kali Uchis)" -> "Flower Boy"
        "Domo23" -> "Wolf"
        else -> "Álbum não encontrado"

    }
    println("Artista: $artista\nMúsica: $musica\nÁlbum: $album")
}

fun trocaMusicaAriana() {
    var artista = ""
    var musica = ""
    var album = ""
    var track = 2

    when (track) {
        0 -> artista = "Artista não encontrado"
        in 1..4 -> artista = "Ariana Grande"
        else -> artista = "Artista não encontrado"
    }

    when (track) {
        1 -> musica = "pov"
        2 -> musica = "thank u, next"
        3 -> musica = "Problem"
        4 -> musica = "Into You"
        else -> musica = "Música não encontrada"
    }

    when (musica) {
        "pov" -> album = "Positions"
        "thank u, next" -> album = "thank u, next"
        "Problem" -> album = "My Everything"
        "Into You" -> album = "Dangerous Woman"
        else -> album = "Álbum não encontrado"
    }

    println("Artista: $artista\nMúsica: $musica\nÁlbum: $album")

}


