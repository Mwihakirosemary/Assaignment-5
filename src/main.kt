fun main(){
    var studies= human("Suhaila",23,57)
    studies.eat(2)
    println(studies.weight)
    studies.speak("I am Magnanimous.")
    studies.birthday()
    println(studies.age)
    var info = user("Hakan","Alaynah","suhailayusuf1999@gmail.com",
        254799864112L,"254flowbird")
    println(info.email)
    println(info.firstName)
}
class human(var name: String,var age: Int,var weight: Int){
    fun eat(studiesWeight: Int): Int{
        weight += studiesWeight
        println("I am eating $studiesWeight Kgs of food.")
        return weight
    }
    fun speak(speach: String){
        println(speach)
    }
    fun birthday(){
        age ++
    }
}
data class user(var firstName: String,var secondName: String,var email: String,
                var phoneNumber: Long,var password: String){

}