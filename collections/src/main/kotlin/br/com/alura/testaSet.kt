package br.com.alura

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Bila", "Carla")
    val assistiramCursoDeKotlin: Set<String> = setOf("Dedê", "Carla", "Alex")
    val assistiramAmbos: MutableSet<String> = mutableSetOf()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoDeKotlin)
    println(assistiramAmbos)

    //Funções infix
    //Union():devolve um novo set com a soma dos elementos
    println(assistiramCursoAndroid + assistiramCursoDeKotlin)
    println(assistiramCursoAndroid union assistiramCursoDeKotlin)

    //subtract(): devolve um novo set subtraindo os elementos contidos no segundo conjunto
    println(assistiramCursoAndroid - assistiramCursoDeKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoDeKotlin)

    //Devolve um novo set apenas com os elementos contidos em ambos os conjuntos
    println(assistiramCursoAndroid intersect assistiramCursoDeKotlin)

    val assistitamList: MutableList<String> = assistiramAmbos.toMutableList()
    assistitamList.add("Alex")
    println(assistitamList)
    println(assistitamList.toSet())
}