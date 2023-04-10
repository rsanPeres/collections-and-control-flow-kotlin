import com.collections.CatSiter
import com.collections.Clinic
import com.control.flow.When
import com.dominio.Cats
import com.dominio.Owners
import com.dominio.Veterinarian
import java.text.DateFormat
import java.time.LocalDateTime

fun main(args: Array<String>) {
    println("Hello World!")
    val cont : When = When()
    cont.cases("Hello")
    cont.cases(1)
    cont.cases(0L)
    cont.cases("hello")


    val cats : Cats = Cats("lilo", listOf(Owners("Rafaela"), Owners("Matheus")))
    for (owner in cats){
        println("Olá ${owner.name}")
    }

    println(if (cats.owners.size > 1) "maior" else "menor")

    val catSiter : CatSiter = CatSiter(mutableListOf<Cats>())
    catSiter.addCats(cats)
    catSiter.addCats(Cats("Flor", listOf(Owners("Rafaela"), Owners("Matheus"))))

    catSiter.copyToRead(catSiter.getCats()).forEach{
        i -> println("Little cat : ${i.name}")
    }

    val vet : Veterinarian = Veterinarian("João", "CV1234")
    val clinic : Clinic = Clinic(mutableMapOf(LocalDateTime.now() to mutableMapOf(vet to cats)), mutableSetOf<Veterinarian>())
    clinic.scheduling(
        LocalDateTime.of(1, 10, 5, 30, 30),Veterinarian("Maria", "CV2345"), cats)
    clinic.schedulingReport()


    val number = listOf(1, 2 , 4 , 5, -1, -9)
    val positives = number.filter { x -> x > 0 }
    val negatives = number.filter { it < 0 }

    val doubled = number.map { x -> x * 2 }
    val tripled = number.map { it * 3 }
    val anyNegative = number.any{ it < 0}
    val anotherList = listOf("Olá", "mundo", "Kotlin")
    val bag = listOf(number, anotherList)
    println(bag.map { it })
    println(bag.flatMap { it })

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}