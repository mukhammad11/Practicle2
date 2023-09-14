fun main(args: Array<String>) {
    //Задание 1
    val age1 = 42.toDouble()
    val age2 = 21.toDouble()
    //Конец 1 задания

    //Задание 2
    val avg1 = (age1 + age2) / 2
    println(avg1)
    //Конец 2 задания

    //Задание 4
    val firstName = "Mykhammad"
    val lastName = "Soltykiev"
    //Конец 4 задания

    //Задание 5
    val fullName = "$lastName $firstName"
    //Конец 5 задания

    //Задание 6
    val myDetails = "Привет, меня зовут $fullName"
    println(myDetails)
    //Конец 6 задания

    //Задание 7
    val Triple = Triple(10, 9, 23)
    //Конец 7 задания

    //Задание 8
    val day = Triple.first
    val month = Triple.second
    val year = Triple.third
    //Конец 8 задания

    //Задание 9
    val date = Pair(month, year)
    println("${date.first}" + "\t${date.second}")
    //Конец 9 задания

    //Задание 10
    val Pair: Pair<Int, Int> = Pair(5, year);
    //Конец 10 задания
}