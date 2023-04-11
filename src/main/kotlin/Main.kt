import com.Api.VeterinarianRequest
import com.collections.CatSitter
import com.collections.Clinic
import com.control.flow.When
import com.dominio.Cats
import com.dominio.Owners
import com.dominio.Veterinarian
import com.dominio.enums.CareType
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

    val catSitter : CatSitter = CatSitter(mutableListOf<Cats>())
    catSitter.addCats(cats)
    catSitter.addCats(Cats("Flor", listOf(Owners("Rafaela"), Owners("Matheus"))))

    catSitter.copyToRead(catSitter.getCats()).forEach{
        i -> println("Little cat : ${i.name}")
    }

    val vetRequest: VeterinarianRequest = VeterinarianRequest("Joao", "CV1234", mutableListOf())
    vetRequest.validate()
    val vet : Veterinarian? = vetRequest?.let {
        it.mapToObject()
    }.also { it?.sayHello(it) }

    val clinic : Clinic = Clinic(mutableMapOf(LocalDateTime.now() to mutableMapOf(vet to cats)), mutableSetOf<Veterinarian>(), mutableMapOf<CareType, Double>())
    clinic.scheduling(
        LocalDateTime.of(1, 10, 5, 20, 30),Veterinarian("Maria", "CV2345", mutableListOf()), cats)
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