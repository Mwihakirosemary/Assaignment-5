fun main(){
    var food = human("Rosemary",23,52)
    food.eat(10)
    println(food.weight)
    food.speak("I am a Programmer.")
    food.birthday()
    println(food.age)
    var info = user("Miriam","Njoroge","kakirosemary@gmail.com",
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