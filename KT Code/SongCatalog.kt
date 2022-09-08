class Song (val title: String, val artist: String, val year: Int, val playCount: Int ){
	val isPopular: Boolean = if(playCount >= 1000) true else false
	
    fun songDesc() {
        println("$title, performed by $artist, was released in $year")
    }
}

fun main() {
    val sao = Song("Courage", "Haruka Tomatsu", 2014, 600000)
    sao.songDesc()
}