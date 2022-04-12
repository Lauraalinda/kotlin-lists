fun main() {
 var p=names( listOf("laura", "john", "joel", "linda", "helga", "kake", "lona", "nadine", "tsuma","juliet") )
    println(p)
    println(peopleHeight(listOf(12,23,24,23,11,23,22)))

    var a=Person("Laura",21,31,70)
    var b=Person("Sakina",18,31,90)
    var c=Person("Shadia",41,41,85)
    var people= mutableListOf<Person>(a,b,c)
    var sort=people.sortedByDescending{people -> people.age}
    println(sort)

    var d=Person("Alinda",24,71,80)
    var e=Person("Kengaaju",28,21,40)
    var add= mutableListOf<Person>(d,e)
    people.addAll(add)
    println(people)

    var f=Car("UAZ2345",34)
    var g=Car("UAZ1145",72)
    var h=Car("UAZ1100",74)
    var list=listOf(f,g,h)
    println(cars(list))

}
fun names(name:List<String>):List<String> {
    var newList= mutableListOf<String>()
    name.forEachIndexed { index, names ->
        if((index%2)==0){
            newList.add(names)
        }
    }

    return newList
}
fun peopleHeight(heights:List<Int>):String{

    var aver=heights.average()
    var sum= heights.sum()
    var q="$aver m $sum m"

    return q

}
data class Person(var name: String,var age:Int, var height: Int, var weight: Int)

data class Car(var registration: String, var mileage: Int)

fun cars(car:List<Car>):Int{
    var sum=0
    car.forEach{x ->
        sum+=x.mileage
    }
    return sum/car.count()
}