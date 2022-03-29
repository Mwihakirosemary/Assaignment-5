fun main(){
    var foodd = human("Suhaila",23,57)
    foodd.eat(3)
    println(food.weight)
    foodd.speak("I am Magnanimous.")
    foodd.birthday()
    println(foodd.age)
    var info = user("Hakan","Alaynah","suhailayusuf1999@gmail.com",
        254799864112L,"254flowbird")
    println(info.email)
    println(info.firstName)
}
class human(var name: String,var age: Int,var weight: Int){
    fun eat(foodWeight: Int): Int{
        weight += foodWeight
        println("I am eating $foodWeight Kgs of food.")
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