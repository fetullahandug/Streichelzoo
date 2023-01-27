class Schaaf(name: String, alter: Int, geschlecht: String, gewicht: Double): Tier(name, alter, geschlecht, gewicht){
    override fun geraeuscheMachen(){
        println("${super.name}: Mehehehehe!")
    }
}