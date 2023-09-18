class Song(artist : String, title : String, year : Int, playCount : Int){
    var artist : String = artist
    var title : String = title
    var year : Int = year
    var playCount : Int = playCount

    fun popular(){
        if(playCount < 1000){
            println("Unpopular")
        }else{
            println("Popular")
        }
    }
    fun printDescription(){
        println("$title, performed by $artist, was released in $year")
    }
}
fun main() {
    val MyNameIsMud = Song("Less Clay Pool", "My Name Is Mud" , 2017, 10000)
    MyNameIsMud.popular()
    MyNameIsMud.printDescription()
}
