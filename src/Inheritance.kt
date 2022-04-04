fun main(){
    var student = Student("Jeff Mtoto",9,"20693432","30kgs")
    student.nationality("Rwanda")
    var politician =Politician("Giza totoro",47,"07865435","103kgs")
    politician.studies()
    println(mod(32,6))
    println(add(2,6,9,3))
    getCharacters("Akirachix")
    println(getCharacters("Monday Mantras"))
    val firstName = "Lona Njema"
    confirmation("Somebody Somewhere")
    takeStrings()
    countries()
    digits()


}
open class Student(var fullname:String,var age:Int,var phonenumber:String,var weight:String){

    open fun studies(){
        println("Iam an upcoming programmer")
    }
    fun nationality(citizen:String){
        var country = "KENYA"
        if (citizen==country){
        println("This is a citizen")
    }
        else{
           println("This is not our citizen!")
        }
}
    }
class Politician(fullname: String,age: Int,phonenumber: String,weight: String):Student(fullname,age,phonenumber,weight){
    override fun studies() {
        println("If i win,I will clear all the bushes")
    }
}
fun mod(num1:Int,num2:Int):Int{
    var calc = num1%num2
    return calc
    //passing parameters returning functions
}
fun add(one:Int,two:Int,three:Int,four:Int):Int{
    var sum = one + two + three
    return sum
}
fun getCharacters(text:String):Int{
    println(text[0].toString()+text[2]+text[3])
    return text.length
    //reusing function for different string operations
}
fun confirmation(firstName:String){
    if (firstName=="Lona Njema"){
        println("That is my name")
    }
    else{
        println("I do not know who that is!")
    }
}
fun takeStrings(){
    var names = arrayOf("Sunday","Monday","Tuesday","Wednesday")
    println(names.contentToString())
}
fun countries(){
    var countrys = arrayOf("kenya","sudan","egypt","zambia")
    println(countrys.sortedArray().contentToString())
}
fun digits(){
    var numbers = arrayOf(33,44,55,66,77,88,99,11,22,)
    println(numbers[1]+numbers[3])
    println(numbers.indexOf(77))
}


