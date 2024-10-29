interface Person{
    val name: String
    val title: String
}

abstract class Engineer(
    override val name: String,
    override val title: String,
    val yearsOfExperience: Int,
    val expertise: List<String>
):Person

class SoftwareEngineer(
    name: String,
    yearsOfExperience: Int,
    expertise: List<String>,
    val nrProjects: Int
):Engineer(name, "softverski inženjer", yearsOfExperience, expertise)

class ElectricalEngineer(
    name: String,
    yearsOfExperience: Int,
    expertise: List<String>,
    val nrCertificates: Int
):Engineer(name, "inženjer elektrotehnike", yearsOfExperience, expertise)

fun printEngineerData(engineer: Engineer){
    print("${engineer.name} je ${engineer.title} sa ${engineer.yearsOfExperience} godina iskustva, ekspert u ${engineer.expertise}, ")
    when(engineer){
        is SoftwareEngineer -> println("radila/o je na ${engineer.nrProjects} projekata.")
        is ElectricalEngineer -> println("ima ${engineer.nrCertificates} certifikata.")
    }
}

fun groupEngineersByExpertise(engineers: List<Engineer>): Map<String, List<Engineer>>{
    return engineers
        .filter{it.yearsOfExperience > 5}
        .fold(mutableMapOf<String, MutableList<Engineer>>()) { acc, engineer ->
            engineer.expertise.forEach{ expertise -> acc.computeIfAbsent(expertise) { mutableListOf() }.add(engineer)
            }
            acc
        }
}

fun findMostExperiencedEngineers(engineers: List<Engineer>): Map<String, Engineer>{
    return engineers
        .groupBy { if(it is SoftwareEngineer) "Softverski inženjer" else "Inženjer elektrotehnike" }
        .mapValues { entry -> entry.value.reduce{max, engineer ->
            if(engineer.yearsOfExperience > max.yearsOfExperience) engineer else max
        } }
}

fun aggregateProjectsAndCertificates(engineers: List<Engineer>): Pair<Int, Int>{
    return engineers.fold(0 to 0){acc, engineer ->
        when(engineer){
            is SoftwareEngineer -> acc.copy(first = acc.first + engineer.nrProjects)
            is ElectricalEngineer -> acc.copy(second = acc.second + engineer.nrCertificates)
            else -> acc
        }
    }
}



fun main (){
    val engineers = listOf(
        SoftwareEngineer("Emina", 8, listOf("Python", "Java"), 15),
        ElectricalEngineer("Alen", 10, listOf("Embedded systems", "FPGA"), 4),
        SoftwareEngineer("Denis", 5, listOf("C++", "Go"), 8),
        ElectricalEngineer("Amina", 6, listOf("CAD", "Analog electronics"), 2),
        SoftwareEngineer("Faris", 12, listOf("Kotlin", "C#"), 20)
    )

    engineers.forEach { printEngineerData(it) }

    val groupedByExpertise = groupEngineersByExpertise(engineers)
    println("Inženjeri grupisani po ekspertizama:")
    groupedByExpertise.forEach { (expertise, engineers) ->
        println("$expertise: ${engineers.joinToString { it.name }}")
    }

    val mostExperiencedEngineers = findMostExperiencedEngineers(engineers)
    println("Najiskusniji inženjeri po grupama: ")
    mostExperiencedEngineers.forEach{(group, engineer) ->
        println("$group: ${engineer.name} sa ${engineer.yearsOfExperience} godina iskustva")
    }

    val (totalProjects, totalCertificates) = aggregateProjectsAndCertificates(engineers)
    println("Ukupno projekata za softverske inženjere: $totalProjects")
    println("Ukupno certifikata za inženjere elektrotehnike: $totalCertificates")

}