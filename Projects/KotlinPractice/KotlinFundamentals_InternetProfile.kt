fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
       // Fill in code
       println("Name: $name")
       println("Age: $age")
       if(hobby == null){
           print("Doesn't have a hobby.")
       }else{
           print("Likes to $hobby.")
       }
       if(referrer == null){
           print(" Doesn't have a referrer.\n")
       }else{
           //Should check if refferer has a hobby. otherwise not to print it. but promt doesn't say to do that
           print(" Has a referrer named " + referrer.name + ", who likes to" + referrer.hobby + ".")
       }
    }
}
